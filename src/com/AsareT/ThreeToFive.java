package com.AsareT;

public class ThreeToFive {

    public static int multiplesOfThreeAndFive(int num){

        int result = 0;

        for (int i = 3; i < num; i++){
            if (divisableByThree(i) || divisableByFive(i)){
                result += i;
            }
        }

        return result;

    }

    public static boolean divisableByThree(int num){
        return (num % 3 == 0);
    }

    public static boolean divisableByFive(int num){
        return (num % 5 == 0);
    }
}
