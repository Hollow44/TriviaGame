import java.util.Arrays;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Question[] questions = new Question[3];

        Question question1 = new Question("Question 1: What is the purpose of the public static void main(String[] args) method in a Java program?",
                new String[]{"1) It defines a custom entry point for the program.",
                        "2) It is used to print messages to the console.",
                        "3) It's where the program starts its execution.",
                        "4) It declares a new class."},
                3
                );

        Question question2 = new Question("Question 2: What is the difference between == and .equals() when comparing two String objects in Java?",
                new String[]{"1) == checks if two String references point to the same memory location, while .equals() compares the actual content.",
                        "2) == compares the contents of String objects, and .equals() checks memory references.",
                        "3) They are the same; there is no difference.",
                        "4) == is used for integers, and .equals() is used for strings."},
                1
        );

        Question question3 = new Question("Question 3: What is the purpose of the new keyword in Java?",
                new String[]{"1) It declares a new variable.",
                        "2) It defines a custom method.",
                        "3) It creates a new instance of a class (object).",
                        "4) It represents a loop control statement."},
                3
        );

        questions[0] = question1;
        questions[1] = question2;
        questions[2] = question3;

        play(questions);

    }

    public static void play(Question[] questions) {
        boolean endGame = false;
        int score = 0;

        while(!endGame) {
            for (int i = 0; i < questions.length; i++) {
                System.out.println();
                System.out.println(questions[i].getQuestion());
                for (int j = 0; j < questions[i].getOptions().length; j++) {
                    System.out.println(questions[i].getOptions()[j]);
                }
                System.out.println("Choose your option: ");
                Scanner scanner = new Scanner(System.in);
                int guess = scanner.nextInt();
                if (guess == questions[i].getCorrectAnswer()) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect :/");
                }
            }
            System.out.println();
            System.out.println("Your final score is: " + score);

            endGame = true;
        }
    }

}
