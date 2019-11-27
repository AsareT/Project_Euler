package com.AsareT;

public class EvenFibonacciNumbers {

    public static int evenFibSumUpTo(int num){
        int result = 0;
        int[] numArr =  new int[3];
        numArr[0] = 1;
        numArr[1] = 1;

        while( numArr[2] != num)
            numArr[2] = numArr[0] + numArr[1];
            if ( isEven(numArr[2]) ) {
                result += numArr[2];
            }
             shiftArrLeft(numArr);
        return result;
    }



    public static int[] shiftArrLeft(int[] numArr){
        numArr[0] = numArr[1];
        numArr[1] = numArr[2];
        numArr[2] = 0;
        return numArr;
    }

    public static boolean isEven(int num){
        return (num % 2 == 0);
    }
}
