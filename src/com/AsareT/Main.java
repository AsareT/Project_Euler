package com.AsareT;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0){
            System.out.println("Which solution would you like to test, choose a number ");
            System.out.println("1. Multiples of 3 and 5 (sum of)");
            System.out.println("0. Exit");

            choice =scanner.nextInt();

            switch (choice){
                case 1: menuThreeToFive();
                    break;
                default:
                    System.out.println("This problem currently doesnt exist");
            }


        }

    }

    private static void menuThreeToFive() {
        System.out.println("Please give a value to be calculated");
        int num = scanner.nextInt();
        System.out.println(ThreeToFive.multiplesOfThreeAndFive(num));

        return;
    }


}
