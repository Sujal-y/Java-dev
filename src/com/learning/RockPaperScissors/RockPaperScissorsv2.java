package src.com.learning.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total_matchs = 0;
        int your_wins = 0;
        int your_loss = 0;
        int draws = 0;
        System.out.println("0 - rock");
        System.out.println("1 - paper");
        System.out.println("2 - scissor");
        System.out.println("3 - exit");

        int input;

        while (true) {
            int computer_choice = random.nextInt(0, 3);
            System.out.println("Enter your choice");
            input = scanner.nextInt();
            if (input == 3) {            //exit loop
                System.out.println("thanks for playing!");
                System.out.println("total matches:- " + total_matchs);
                System.out.println("total wins:- " + your_wins);
                System.out.println("total loss:- " + your_loss);
                System.out.println("total draws:- " + draws);
                break;
            }

            if (input == computer_choice) {
                System.out.println("Its a draw!!");
                total_matchs++;
                draws++;
            } else if (input == 0 && computer_choice == 2) {
                System.out.println("you win!!");
                total_matchs++;
                your_wins++;
            }//user=rock
            else if (input == 0 && computer_choice == 1) {
                System.out.println("you lose!!");
                total_matchs++;
                your_loss++;
            }


            if (input == 1 && computer_choice == 0) {
                System.out.println("you win!!");
                total_matchs++;
                your_wins++;
            }//user=paper
            else if (input == 1 && computer_choice == 2) {
                System.out.println("you lose!!");
                total_matchs++;
                your_loss++;
            }

            if (input == 2 && computer_choice == 1) {
                System.out.println("you win!!");
                total_matchs++;
                your_wins++;
            }//user=scissor

            else if (input == 2 && computer_choice == 0) {
                System.out.println("you lose!!");
                total_matchs++;
                your_loss++;
            }
        }
    }
}