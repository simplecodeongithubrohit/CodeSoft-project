import java.util.Random;
import java.util.Scanner;

class game {
    int generated_number;

    public game() {
        Random rand = new Random();
        generated_number = rand.nextInt(100);
        System.out.println("Guess the generated number from 1 to 100");
    }

    public int generatedno() {
        return generated_number;
    }
}

public class numberGame {
    static int takeinput() {
        int userguess;
        System.out.println("enter the no");
        Scanner sc = new Scanner(System.in);
        userguess = sc.nextInt();
        return userguess;
    }

    static void iscorrectguess(int x, int y) {
        if (x == y) {
            System.out.println("the guessed no is correct");
        } else if (x < y) {
            System.out.println("too low");
        } else {
            System.out.println("too high");
        }
    }

    public static void main(String[] args) {
        int playAgain;
        do {
            System.out.println("Do you want to play the game,press 0 to exit the game and 1 to start the game");
            int userguess = 0, generated_number = 0, count = 0, attempts = 0;
            Scanner sc = new Scanner(System.in);
            playAgain = sc.nextInt();
            if (playAgain == 0) {
                System.out.println("Thanks for playing!");
                System.exit(playAgain);
            }
            if (playAgain == 1) {
                game a = new game();
                do {
                    if (attempts == 20) {
                        System.out.println("The no of attempts to guess the number is over");
                        System.exit(0);
                    }
                    userguess = takeinput();
                    generated_number = a.generatedno();
                    iscorrectguess(userguess, generated_number);
                    count++;
                    attempts++;
                } while (userguess != generated_number);

                System.out.println("User's score based on number of attempts=" + count);
            }
        } while (playAgain == 1);

    }

}
