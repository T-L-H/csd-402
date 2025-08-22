//Tevyah Hanley 08/21/2025 M2 Programming Assignment
//This program is a super intense game of Rock, Paper, Scissors.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int myNumber = randomNumber.nextInt(3) + 1; 

        Scanner input = new Scanner(System.in);
        System.out.print("Rock, Paper, Scissors! Enter 1 to show rock, 2 for paper, and 3 for scissors:  ");
        int userNumber = input.nextInt();

        String myChoice = (myNumber == 1) ? "Rock" : (myNumber == 2) ? "Paper" : "Scissors";
        String userChoice = (userNumber == 1) ? "Rock" : (userNumber == 2) ? "Paper" : "Scissors";

        String result;
        if (userNumber == myNumber) {
            result = "Aw, its a draw. Lame.";
        } else if ((myNumber == 1 && myNumber == 3) || (userNumber == 2 && myNumber == 1) || (userNumber == 3 && myNumber == 2)) {
            result = "You bested me here... I'll get you next time.";
        } else {
            result = "HA! I won! Imagine losing, couldn't be me.";
        }

        System.out.println("I chose to put out: " + myChoice);
        System.out.println("You chose to put out: " + userChoice);
        System.out.println("Result: " + result);
    }
}
