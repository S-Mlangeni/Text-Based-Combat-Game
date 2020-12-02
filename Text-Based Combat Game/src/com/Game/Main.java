package com.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        String[] animals = {"Lion", "Tiger", "Leopard"};
        int animalLifeScore = 40; //points
        int animalAttackScore = 10; //points

        int playerLifeScore = 40; //points
        int playerAttackScore = 10; //points

        System.out.println("Welcome to the wild!");
        System.out.println("---------------------");
        MainLoop:
        while(true){
            String animal = animals[ran.nextInt(animals.length)];
            System.out.println(animal + " is attacking!");


            InnerLoop:
            while (playerLifeScore > 0) {
                System.out.println("\nYour life score is " + playerLifeScore);
                System.out.println(animal + " life score is " + animalLifeScore);
                System.out.println("\nWhat's your next move? Choose number option below:");
                System.out.println("1. Fight!");
                System.out.println("2. Flight!");

                int userinput = input.nextInt();
                // System.out.println("You have chosen option " + userinput + ", are you sure about this?");
                if (userinput==1) {
                    int userdamagetaken = ran.nextInt(animalAttackScore);
                    int animaldamagetaken = ran.nextInt(playerAttackScore);
                    playerLifeScore -= userdamagetaken;
                    animalLifeScore -= animaldamagetaken;
                    if (animalLifeScore <= 0) {
                        System.out.println("\n You have killed " + animal + ". CONGRATULATIONS!");
                        break;
                    }
                }
                else if (userinput==2) {
                    System.out.println("You have escaped from " + animal + ". Stay Safe!");
                    break;
                }
                else {
                    System.out.println("Invalid input. Try again.");
                }
            }
            if (playerLifeScore <= 0) {
                System.out.println("\n You have been killed by " +animal + "! GAME OVER!");
                break;
            }
            else {
                break;
            }


        }
    }
}
