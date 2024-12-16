package com.example.client;

import cobra.quiz.QuizGameGrpc;
import cobra.quiz.QuizOuterClass;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.Optional;

public class QuizGameClient {
    private final QuizGameGrpc.QuizGameBlockingStub stub;
    private final String playerName;

    public QuizGameClient(String host, int port, String playerName) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.stub = QuizGameGrpc.newBlockingStub(channel);
        this.playerName = playerName;

        // Register the player
        registerPlayer();
    }

    private void registerPlayer() {
        QuizOuterClass.RegisterPlayerRequest request = QuizOuterClass.RegisterPlayerRequest.newBuilder()
                .setPlayerName(playerName)
                .build();
        stub.registerPlayer(request);
    }

    public QuizOuterClass.GetQuizResponse fetchQuizzes() {
        try {
            return stub.getQuiz(Empty.newBuilder().build());
        } catch (StatusRuntimeException e) {
            System.err.println("Error fetching quizzes: " + e.getStatus());
            return QuizOuterClass.GetQuizResponse.getDefaultInstance();
        }
    }

    public boolean submitAnswer(int quizId, int selectedAnswer) {
        try {
            QuizOuterClass.PlayRequest request = QuizOuterClass.PlayRequest.newBuilder()
                    .setQuizId(quizId)
                    .setAnswer(selectedAnswer)
                    .setPlayerName(playerName)
                    .build();

            QuizOuterClass.PlayResponse response = stub.play(request);
            return response.getCorrect();
        } catch (StatusRuntimeException e) {
            System.err.println("Error submitting answer: " + e.getStatus());
            return false;
        }
    }

    public int getCurrentScore() {
        try {
            QuizOuterClass.GetPlayerScoresResponse scoresResponse =
                    stub.getPlayerScores(Empty.newBuilder().build());

            Optional<QuizOuterClass.Player> playerScore = scoresResponse.getPlayersList().stream()
                    .filter(player -> player.getPlayerName().equals(playerName))
                    .findFirst();

            return playerScore.map(QuizOuterClass.Player::getScore).orElse(0);
        } catch (StatusRuntimeException e) {
            System.err.println("Error fetching score: " + e.getStatus());
            return 0;
        }
    }

    public List<QuizOuterClass.Player> getLeaderboard() {
        try {
            return stub.getPlayerScores(Empty.newBuilder().build()).getPlayersList();
        } catch (StatusRuntimeException e) {
            System.err.println("Error fetching leaderboard: " + e.getStatus());
            return List.of();
        }
    }

}
