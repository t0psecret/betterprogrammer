package com.betterprogrammer.karpunin;

import java.util.*;


public class BetterProgrammerTask3 {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static int getLevelSum(Node root, int N) {
        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */
        int resultSum = 0;
        if (N > 0 && root != null) {
            resultSum = root.getValue();
            for (Node childNode : root.getChildren()) {
                resultSum += getLevelSum(childNode, N-1);
            }
        }
        return resultSum;
    }
}