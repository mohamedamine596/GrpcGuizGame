package com.example;

import cobra.quiz.QuizGameGrpc;
import cobra.quiz.QuizOuterClass;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;

import java.util.ArrayList;
import java.util.List;

public class Service extends QuizGameGrpc.QuizGameImplBase {
    private final List<QuizOuterClass.Player> players = new ArrayList<>();
    private final List<QuizOuterClass.Quiz> quizzes = new ArrayList<>();

    public Service() {
        // Initialize quiz data
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(1)
                .setQuestion("What is the capital of France?")
                .setAnswer1("Berlin")
                .setAnswer2("Madrid")
                .setAnswer3("Paris")
                .setAnswer4("Rome")
                .setCorrectAnswer(3)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(2)
                .setQuestion("What is the capital of Germany?")
                .setAnswer1("Berlin")
                .setAnswer2("Madrid")
                .setAnswer3("Paris")
                .setAnswer4("Rome")
                .setCorrectAnswer(1)
                .build());

        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(3)
                .setQuestion("What is the capital of Italy?")
                .setAnswer1("Berlin")
                .setAnswer2("Madrid")
                .setAnswer3("Paris")
                .setAnswer4("Rome")
                .setCorrectAnswer(4)
                .build());
        quizzes.add(QuizOuterClass.Quiz.newBuilder()
                .setId(4)
                .setQuestion("What is the capital of Spain?")
                .setAnswer1("Berlin")
                .setAnswer2("Madrid")
                .setAnswer3("Paris")
                .setAnswer4("Rome")
                .setCorrectAnswer(2)
                .build());
    }

    @Override
public void registerPlayer(QuizOuterClass.RegisterPlayerRequest request,
                               StreamObserver<QuizOuterClass.RegisterPlayerResponse> responseObserver) {
        String playerName = request.getPlayerName();

        boolean playerExists = players.stream()
                .anyMatch(player -> player.getPlayerName().equals(playerName));

            if (playerExists) {
            QuizOuterClass.RegisterPlayerResponse response = QuizOuterClass.RegisterPlayerResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Player already registered!")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        players.add(QuizOuterClass.Player.newBuilder()
                .setPlayerName(playerName)
                .setScore(0)
                .build());

        QuizOuterClass.RegisterPlayerResponse response = QuizOuterClass.RegisterPlayerResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Player registered successfully!")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getQuiz(Empty request,
                        StreamObserver<QuizOuterClass.GetQuizResponse> responseObserver) {
        QuizOuterClass.GetQuizResponse response = QuizOuterClass.GetQuizResponse.newBuilder()
                .addAllQuizzes(quizzes)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void play(QuizOuterClass.PlayRequest request,
                     StreamObserver<QuizOuterClass.PlayResponse> responseObserver) {
        QuizOuterClass.Quiz selectedQuiz = quizzes.stream()
                .filter(quiz -> quiz.getId() == request.getQuizId())
                .findFirst()
                .orElse(null);

        boolean correct = selectedQuiz != null && selectedQuiz.getCorrectAnswer() == request.getAnswer();
        int updatedScore = 0;

        if (correct) {
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getPlayerName().equals(request.getPlayerName())) {
                    QuizOuterClass.Player updatedPlayer = players.get(i).toBuilder()
                            .setScore(players.get(i).getScore() + 10)
                            .build();
                    players.set(i, updatedPlayer);
                    updatedScore = updatedPlayer.getScore();
                    break;
                }
            }
        }

        QuizOuterClass.PlayResponse response = QuizOuterClass.PlayResponse.newBuilder()
                .setCorrect(correct)
                .setUpdatedScore(updatedScore)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPlayerScores(Empty request,
                                StreamObserver<QuizOuterClass.GetPlayerScoresResponse> responseObserver) {
        QuizOuterClass.GetPlayerScoresResponse response = QuizOuterClass.GetPlayerScoresResponse.newBuilder()
                .addAllPlayers(players)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
