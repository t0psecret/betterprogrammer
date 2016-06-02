package com.betterprogrammer.karpunin;


import java.util.*;


public class BetterProgrammerTask {

    public static double getProbability(int Y, int X) {
        /*
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */

        long xCombinations = getCombinations(Y, X);
        long totalCombinations = getTotalCombinations(Y, 6);
        return 1.0 * xCombinations / totalCombinations;
    }

    private static long getTotalCombinations(int Y, int N) {
        int n = N;
        int k = Y;
        return calculateFactorial(n+k-1) / calculateFactorial(k) / calculateFactorial(n-1);
    }

    private static long getCombinations(int Y, int X) {
        long result = 0;
        if (X <= Y) {
            result = getTotalCombinations(Y - X, 6);
        }
        return result;
    }

    private static long calculateFactorial(int k) {
        return k <= 1 ? 1 : k * calculateFactorial(k-1);
    }
}


