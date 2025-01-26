package src.com.learning.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsv4 {
    public static int total_matches = 0, your_wins = 0, your_loss = 0, draws = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int input;
        String computer_choiceinwords;
        intro();
        String[] options = {"ROCK", "PAPER", "SCISSOR"};

        while (true) {
            int computer_choice = random.nextInt(0, 3);
            computer_choiceinwords = options[computer_choice];
            System.out.println("Enter your choice");
            input = scanner.nextInt();
            if (input == 3) {            //exit loop
                quitgame();
                break;
            }
            if (input == 4) { //shows help to user
                intro();
            }
            if (input>4||input<0){
                System.out.println("maybe the input is wrong??");
            }
            if (input == computer_choice) { //draw case
                finisher(computer_choiceinwords, options[input]);
                System.out.println("Its a draw!!");
                draws++;
            }
            else if (input == 1 && computer_choice == 2 || ((input == 2) && computer_choice == 0) || ((input == 0) && computer_choice == 1)) { //lose case
                finisher(computer_choiceinwords, options[input]);
                System.out.println("you lose!!");
                your_loss++;
                }
            else if (input == 0 && computer_choice == 2 || input == 2 && computer_choice == 1 || input == 1 && computer_choice == 0) { //win case
                finisher(computer_choiceinwords, options[input]);
                System.out.println("you win!!");
                your_wins++;
            }

        }

    }

    private static void finisher(String computer_choiceinwords, String your_choiceinwords) {
        System.out.println("Your choice = "+ your_choiceinwords);
        System.out.println("computer choice = "+ computer_choiceinwords);
        total_matches++;
    }

    public static void quitgame() {
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