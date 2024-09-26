package edu.guilford;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("You will roll 10 dice, how many sides of the dice should you have");
        // default for loop, prints loop variable as it counts up  
        for (int i = 5; i < 7; i++) {
            int diceRoll = rand.nextInt (1,6);
            System.out.prIntln ("Dice roll i = " + i);
            int sides = scan.nextInt (1,6);
            int number = scan.nextInt ();
            int sum =0;

            Random rand= new Random();
        for (int i = 0; i < number; i++);
        int diceroll = rand.nextInt(1,sides + 1);
        sum += diceRoll; 

    system.out.println(number + "d" + sides + "=" +sum);
    scan.close();
        }

    }
}