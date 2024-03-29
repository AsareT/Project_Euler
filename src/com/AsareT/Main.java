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
            System.out.println("2. Sum of even Fibonacci numbers up to");
            System.out.println("3. Largest Prime factor");
            System.out.println("0. Exit");

            choice =scanner.nextInt();

            switch (choice){
                case 1: menuThreeToFive();
                    break;
                case 2: menuFibonacciUpTo();
                    break;
                case 3: menuLargestPrimeFactor();
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
    }

    private static void menuFibonacciUpTo() {
        System.out.println("Please give a value to be calculated");
        int num = scanner.nextInt();
        System.out.println(EvenFibonacciNumbers.evenFibSumUpTo(num));
    }

    private static void menuLargestPrimeFactor() {
        System.out.println("Please give a value to be calculated");
        long num = scanner.nextLong();
        System.out.println(LargestPrimeFactor.largestPrimeFactorOf(num));
    }
}
