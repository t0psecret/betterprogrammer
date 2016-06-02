package com.betterprogrammer.karpunin;

import java.util.*;


public class BetterProgrammerTask2 {

    public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a set of elements that can be found only in set a or set b,
          but not in both Sets.
          The method should not change the content of the parameters.
         */
        Set<Object> resultSet = new HashSet<>();
        resultSet.addAll(getUniqueElementsFromSetA(a, b));
        resultSet.addAll(getUniqueElementsFromSetA(b, a));
        return resultSet;
    }

    public static Set<Object> createRandomSet() {
        Set<Object> resultSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            resultSet.add(random.nextInt(10));
        }
        return resultSet;
    }

    public static void printSet(Set<Object> pSet) {
        for (Object o :pSet) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    private static Set<Object> getUniqueElementsFromSetA(Set<Object> a, Set<Object> b) {
        Set<Object> resultSet = new HashSet<>();
        for (Object o : a) {
            if ( !b.contains(o) )
                resultSet.add(o);
        }
        return resultSet;
    }


}
