import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("🎉 Welcome to the Java Quiz Game!");
        System.out.println("Answer the following questions:\n");

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("a) Berlin");
        System.out.println("b) Madrid");
        System.out.println("c) Paris");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("c")) {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is c) Paris\n");
        }

        // Question 2
        System.out.println("2. Which language is used for Android app development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) Swift");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("a")) {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is a) Java\n");
        }

        // Question 3
        System.out.println("3. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is b) Mars\n");
        }

        // Final Score
        System.out.println("🎯 Quiz Over! Your final score is: " + score + "/3");

        if (score == 3) {
            System.out.println("🏆 Excellent job!");
        } else if (score == 2) {
            System.out.println("👍 Good work!");
        } else {
            System.out.println("💡 Keep practicing!");
        }

        scanner.close();
    }
}
