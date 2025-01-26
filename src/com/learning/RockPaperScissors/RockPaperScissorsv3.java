package src.com.learning.RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int input, total_matches = 0, your_wins = 0, your_loss = 0, draws = 0;
        intro();

        while (true) {
            int computer_choice = random.nextInt(0, 3);
            System.out.println("Enter your choice");
            input = scanner.nextInt();
            if (input == 3) {            //exit loop
                endgame(total_matches, your_wins, your_loss, draws);
                break;
            }
            if (input == 4) {
                intro();
            }

            if (input == computer_choice) {
                System.out.println("Its a draw!!");
                total_matches++;
                draws++;
            } else if (input == 0 && computer_choice == 2 || input == 2 && computer_choice == 1 || input == 1 && computer_choice == 0) {
                System.out.println("you win!!");
                total_matches++;
                your_wins++;
            } else if (input == 1 && computer_choice == 2 || input == 2 && computer_choice == 0 || input == 0 && computer_choice == 1) {
                System.out.println("you lose!!");
                total_matches++;
                your_loss++;
            }

        }

    }

    public static void endgame(int total_matches, int your_wins, int your_loss, int draws) {
        System.out.println("thanks for playing!");
        System.out.println("total matches:- " + total_matches);
        System.out.println("total wins:- " + your_wins);
        System.out.println("total loss:- " + your_loss);
        System.out.println("total draws:- " + draws);
    }

    public static void intro() {
        System.out.println("0 - rock");
        System.out.println("1 - paper");
        System.out.println("2 - scissor");
        System.out.println("3 - exit");
        System.out.println("4 - see this again");
    }

}