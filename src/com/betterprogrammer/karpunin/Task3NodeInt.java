package com.betterprogrammer.karpunin;

import java.util.ArrayList;
import java.util.List;

public class Task3NodeInt implements BetterProgrammerTask3.Node {

    private int value;
    private ArrayList<BetterProgrammerTask3.Node> children;

    public static Task3NodeInt createTree(int value, int N) {
        Task3NodeInt resultNode = new Task3NodeInt(value);
        if (N < 4) {
            N++;
            resultNode.addChild(createTree(N, N));
            resultNode.addChild(createTree(N, N));
        }
        return resultNode;
    }

    public Task3NodeInt(int value) {
        super();
        this.value = value;
        children = new ArrayList<>();
    }

    public void addChild(Task3NodeInt pNodeInt) {
        children.add(pNodeInt);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public List<BetterProgrammerTask3.Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return toString(1);
    }

    private String toString(int pLevel){
        String resultString = getValue() + "|";
        for (BetterProgrammerTask3.Node childNode : getChildren()) {
            resultString += ((Task3NodeInt) childNode).toString(pLevel+1) + "\n" +getSpaces(pLevel*2);
        }
        return resultString;
    }

    private String getSpaces(int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += " ";
        }
        return result;
    }

}
