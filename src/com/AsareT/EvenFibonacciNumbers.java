package com.AsareT;

public class EvenFibonacciNumbers {

    public static long evenFibSumUpTo(int num){
        long result = 0;
        int[] numArr =  new int[3];
        numArr[0] = 1;
        numArr[1] = 1;
        // I set numArr[2] to 0 after the loop so it can be properly checkd against num
        while( numArr[2] <= num) {
            numArr[2] = 0;
            numArr[2] = numArr[0] + numArr[1];
            if (isEven(numArr[2])) {
                result += numArr[2];

            }
            shiftArrLeft(numArr);
        }
            return result;
    }



    public static int[] shiftArrLeft(int[] numArr){
        numArr[0] = numArr[1];
        numArr[1] = numArr[2];

        return numArr;
    }

    public static boolean isEven(int num){
        return (num % 2 == 0);
    }
}
