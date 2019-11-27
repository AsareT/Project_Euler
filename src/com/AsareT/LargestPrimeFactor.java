package com.AsareT;

public class LargestPrimeFactor {

    public static long largestPrimeFactorOf(long num){
        long largest = 0;
        //uses the division approach to finding the largest prime number
        for ( long i = 3; i < num; i++ ){
            while ( num % i == 0 ){
                num = num / i;
            }
        }
        return num;
    }


    public static boolean isPrime(long num){
        if ( num == 2 || num == 3){
            return true;
        }
        for ( int i = 3; i < num; i++){
            if ( (num % i) == 0){
                return false;
            }
        }
        return true;
    }
}
