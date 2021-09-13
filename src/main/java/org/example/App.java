package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?**USE Y/N**");
        String ans1 = a.nextLine();

        if((ans1).equals("Y")){
            Scanner aa = new Scanner(System.in);
            System.out.println("Are the battery terminals corroded?");
            String ans2 = aa.nextLine();
            if((ans2).equals("Y")){
                System.out.println("Clean terminals and try starting again.");

            }
            if((ans2).equals("N")){
                System.out.println("Replace cables and try again.");

            }

        }
        if((ans1).equals("N")){
            Scanner aaa = new Scanner(System.in);
            System.out.println("Does the car make a slicking noise?");
            String ans3 = aaa.nextLine();
            if((ans3).equals("Y")){System.out.println("replace the battery.");}
            if((ans3).equals("N")){

                Scanner aaaa = new Scanner(System.in);
                System.out.println("Does the car crank up but fail to start");
                String ans4 = aaaa.nextLine();
                if((ans4).equals("Y")){ System.out.println("Check spark plug connections.");}
                if((ans4).equals("N")){
                    Scanner aaaaa = new Scanner(System.in);
                    System.out.println("Does the engine start and then die?");
                    String ans5 = aaaaa.nextLine();
                    if((ans5).equals("Y")){
                        Scanner aaaaaa = new Scanner(System.in);
                        System.out.println("Does you car have fuel injection?");
                        String ans6 = aaaaaa.nextLine();
                        if((ans6).equals("Y")){
                            System.out.println("Get it in for service.");
                        }
                        if((ans6).equals("N")){System.out.println("Check to ensure the choke is opening and closing.");}


                    }
                    if((ans5).equals("N")){ System.out.println("this shouldn't be possible!!");}
                }



            }

        }


    }
}
