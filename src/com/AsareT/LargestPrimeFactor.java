package com.AsareT;

public class LargestPrimeFactor {

    public static long largestPrimeFactorOf(long num){
        long largest = 0;

        for ( long i = 1; i < num; i++ ){
            if ( num % i == 0 && isPrime(i)){
                largest = i;
            }
        }
        return largest;
    }


    public static boolean isPrime(long num){
        if ( num == 2 || num == 3){
            return true;
        }
        for ( int i = 2; i < num; i++){
            if ( (num % i) == 0){
                return false;
            }
        }
        return true;
    }
}
