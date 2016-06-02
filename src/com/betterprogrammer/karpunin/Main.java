package com.betterprogrammer.karpunin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	    ====================================================
//      task 1 test
//      ====================================================

        //Object[] array = {new Integer(2), new Integer(67), new Integer(5), new Integer(6)};
        //printArray(array);
        //array = BetterProgrammerTask.reverseArray(array);
        //printArray(array);

//	    ====================================================
//      task 2 test
//      ====================================================

//        Set<Object> aSet = returnRandomSet();
//        Set<Object> bSet = returnRandomSet();
//        printSet(aSet);
//        System.out.println("==============================");
//        printSet(bSet);
//        System.out.println("==============================");
//        aSet = BetterProgrammerTask.getUniqueElements(aSet, bSet);
//        printSet(aSet);

//	    ====================================================
//      task 3 test
//      ====================================================

//        NodeInt node = createTree(1, 1);
//        System.out.println(node.toString());
//        System.out.println("" + BetterProgrammerTask.getLevelSum(node, 2));

//	    ====================================================
//      task 4 test
//      ====================================================

        System.out.println(BetterProgrammerTask.getProbability(10, 3));

    }

    private static void printArray(Object[] pArray) {
        for (Object value : pArray) {
            System.out.println(value);
        }
    }

    private static Set<Object> returnRandomSet() {
        Set<Object> resultSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            resultSet.add(new Integer(random.nextInt(10)));
        }
        return resultSet;
    }

    private static void printSet(Set<Object> pSet) {
        for (Object o :pSet) {
            System.out.println(o);
        }
    }

    /*private static class NodeInt implements BetterProgrammerTask.Node {

        private int value;
        private ArrayList<BetterProgrammerTask.Node> children;

        public NodeInt(int value) {
            super();
            this.value = value;
            children = new ArrayList<BetterProgrammerTask.Node>();
        }

        public void addChild(NodeInt pNodeInt) {
            children.add(pNodeInt);
        }

        @Override
        public int getValue() {
            return value;
        }

        @Override
        public List<BetterProgrammerTask.Node> getChildren() {
            return children;
        }

        @Override
        public String toString() {
            String resultString = getValue() + "|";
            for (Object childNode :getChildren()) {
                resultString += childNode.toString();
            }
            return resultString;
        }
    }

    public static NodeInt createTree(int value, int N) {
        NodeInt resultNode = new NodeInt(value);
        if (N < 4) {
            resultNode.addChild(createTree(N+1, N+1));
            resultNode.addChild(createTree(N+1, N+1));
        }
        return resultNode;
    }*/
}
