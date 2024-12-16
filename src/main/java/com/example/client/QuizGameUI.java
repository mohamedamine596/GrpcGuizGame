package com.example.client;

import cobra.quiz.QuizOuterClass;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class QuizGameUI extends JFrame {
    private QuizGameClient quizClient;
    private JLabel scoreLabel;
    private JLabel questionLabel;
    private JRadioButton[] answerButtons;
    private ButtonGroup answerGroup;
    private List<QuizOuterClass.Quiz> quizzes;
    private int currentQuizIndex = 0;

    public QuizGameUI() {
        setTitle("Quiz Master");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        initComponents();
    }

    private void initComponents() {
        // Set a modern look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Main panel with gradient background
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(135, 206, 235),
                        getWidth(), getHeight(), new Color(25, 25, 112));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Player Name Input Dialog with custom styling
        UIManager.put("OptionPane.background", new Color(230, 230, 250));
        UIManager.put("Panel.background", new Color(230, 230, 250));
        String playerName = (String) JOptionPane.showInputDialog(
                null,
                "Enter Your Name:",
                "Quiz Master",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                ""
        );

        if (playerName == null || playerName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid name. Exiting.");
            System.exit(0);
        }

        // Initialize client
        quizClient = new QuizGameClient("localhost", 1323, playerName);

        // Score Panel
        JPanel scorePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        scorePanel.setOpaque(false);
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        scorePanel.add(scoreLabel);
        mainPanel.add(scorePanel, BorderLayout.NORTH);

        // Quiz Panel
        JPanel quizPanel = new JPanel();
        quizPanel.setOpaque(false);
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));

        // Question Label
        questionLabel = new JLabel("Loading question...");
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        quizPanel.add(questionLabel);
        quizPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Answer Buttons
        answerGroup = new ButtonGroup();
        answerButtons = new JRadioButton[4];
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JRadioButton();
            answerButtons[i].setOpaque(false);
            answerButtons[i].setForeground(Color.WHITE);
            answerButtons[i].setFont(new Font("Arial", Font.PLAIN, 16));
            answerGroup.add(answerButtons[i]);

            // Add some spacing
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            buttonPanel.setOpaque(false);
            buttonPanel.add(answerButtons[i]);
            quizPanel.add(buttonPanel);
        }

        quizPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Submit and Leaderboard Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton submitButton = createStyledButton("Submit Answer");
        JButton leaderboardButton = createStyledButton("View Leaderboard");

        submitButton.addActionListener(e -> submitAnswer());
        leaderboardButton.addActionListener(e -> showLeaderboard());

        buttonPanel.add(submitButton);
        buttonPanel.add(leaderboardButton);
        quizPanel.add(buttonPanel);

        mainPanel.add(quizPanel, BorderLayout.CENTER);

        // Set content pane
        setContentPane(mainPanel);

        // Load first quiz
        loadQuizzes();
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(150, 40));

        // Hover effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(100, 160, 210));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(70, 130, 180));
            }
        });

        return button;
    }

    private void loadQuizzes() {
        QuizOuterClass.GetQuizResponse response = quizClient.fetchQuizzes();
        quizzes = response.getQuizzesList();
        displayCurrentQuiz();
    }

    private void displayCurrentQuiz() {
        if (currentQuizIndex >= quizzes.size()) {
            JOptionPane.showMessageDialog(this, "Quiz completed!");
            return;
        }

        QuizOuterClass.Quiz currentQuiz = quizzes.get(currentQuizIndex);
        questionLabel.setText(currentQuiz.getQuestion());

        answerButtons[0].setText(currentQuiz.getAnswer1());
        answerButtons[1].setText(currentQuiz.getAnswer2());
        answerButtons[2].setText(currentQuiz.getAnswer3());
        answerButtons[3].setText(currentQuiz.getAnswer4());

        answerGroup.clearSelection();
    }

    private void submitAnswer() {
        int selectedAnswer = -1;
        for (int i = 0; i < answerButtons.length; i++) {
            if (answerButtons[i].isSelected()) {
                selectedAnswer = i + 1;
                break;
            }
        }

        if (selectedAnswer == -1) {
            JOptionPane.showMessageDialog(this, "Please select an answer!");
            return;
        }

        QuizOuterClass.Quiz currentQuiz = quizzes.get(currentQuizIndex);
        boolean isCorrect = quizClient.submitAnswer(currentQuiz.getId(), selectedAnswer);

        if (isCorrect) {
            JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            JOptionPane.showMessageDialog(this, "Wrong!");
        }

        // Update score
        scoreLabel.setText("Score: " + quizClient.getCurrentScore());

        // Move to next quiz
        currentQuizIndex++;
        displayCurrentQuiz();
    }

    private void showLeaderboard() {
        List<QuizOuterClass.Player> leaderboard = new ArrayList<>(quizClient.getLeaderboard());
        leaderboard.sort((a, b) -> b.getScore() - a.getScore());



        // Create a styled leaderboard
        JPanel leaderboardPanel = new JPanel();
        leaderboardPanel.setLayout(new BoxLayout(leaderboardPanel, BoxLayout.Y_AXIS));
        leaderboardPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JLabel titleLabel = new JLabel("Leaderboard");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leaderboardPanel.add(titleLabel);
        leaderboardPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        for (QuizOuterClass.Player player : leaderboard) {
            JLabel playerLabel = new JLabel(
                    player.getPlayerName() + ": " + player.getScore() + " points"
            );
            playerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            leaderboardPanel.add(playerLabel);
        }

        JOptionPane.showMessageDialog(
                this,
                leaderboardPanel,
                "Leaderboard",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizGameUI().setVisible(true));
    }
}


