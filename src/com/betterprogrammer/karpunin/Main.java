package com.betterprogrammer.karpunin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	    ====================================================
//      task 1 test
//      ====================================================
        Object[] array = {2, 67, 5, 6};
        BetterProgrammerTask1.printArray(array);
        array = BetterProgrammerTask1.reverseArray(array);
        System.out.println("___________");
        BetterProgrammerTask1.printArray(array);

        printDelimiter();
//	    ====================================================
//      task 2 test
//      ====================================================
        Set<Object> aSet = BetterProgrammerTask2.createRandomSet();
        Set<Object> bSet =  BetterProgrammerTask2.createRandomSet();
        BetterProgrammerTask2.printSet(aSet);
        System.out.println("___________");
        BetterProgrammerTask2.printSet(bSet);
        System.out.println("___________");
        aSet = BetterProgrammerTask2.getUniqueElements(aSet, bSet);
        BetterProgrammerTask2.printSet(aSet);

        printDelimiter();
//	    ====================================================
//      task 3 test
//      ====================================================
        Task3NodeInt node = Task3NodeInt.createTree(1, 1);
        System.out.println(node.toString());
        System.out.println(BetterProgrammerTask3.getLevelSum(node, 2));

        printDelimiter();
//	    ====================================================
//      task 4 test
//      ====================================================
        System.out.println(BetterProgrammerTask4.getProbability(10, 3));

    }

    private static void printDelimiter(){
        System.out.println("=============================================");
    }




}
