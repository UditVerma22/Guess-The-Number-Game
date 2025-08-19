import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess the number (1 to 100):");

        while (guess != number) {
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        }
    }
}
