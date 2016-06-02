package com.betterprogrammer.karpunin;

public class BetterProgrammerTask1 {

    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
        Object[] resultArray = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            resultArray[a.length - i - 1] = a[i];
        }
        return resultArray;
    }

    public static void printArray(Object[] pArray) {
        for (Object value : pArray) {
            System.out.print(value+ " ");
        }
        System.out.println();
    }
}