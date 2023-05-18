package mini_project;
import java.util.Scanner;

public class quiz {
    private static final String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "Who painted the Mona Lisa?"
    };
    private static final String[] options = {
        "A. London  B. Paris  C. Rome  D. Madrid",
        "A. Venus  B. Mars  C. Jupiter  D. Saturn",
        "A. Pablo Picasso  B. Leonardo da Vinci  C. Vincent van Gogh  D. Michelangelo"
    };
    private static final int[] answers = {2, 2, 1}; // Index of the correct option for each question

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer! The correct answer is option " + answers[i]);
            }
        }

        System.out.println("\nQuiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);
    }
}
