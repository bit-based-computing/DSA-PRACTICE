package com.foysal.dsa.arrays;

public class MinDominoRotations {  // LeetCode 1007

    public int minDominoRotations(int[] tops, int[] bottoms) {
        int length = tops.length;
        int minCount = length + 1;
        for(int i = 1; i <= 6; i++) {
            int x = getMinimumSwap(i, tops, bottoms);
            if(x != -1) minCount = Math.min(minCount , x);
        }
        return minCount == length + 1 ? -1 : minCount;
    }

    private int getMinimumSwap(int t, int[] tops, int[] bottoms){
        int tCount = 0;
        int bCount = 0;
        for(int i = 0; i < tops.length; i++) {
            if(t != tops[i] && t != bottoms[i]) return -1;
            if(t != tops[i]) tCount++;
            if(t != bottoms[i]) bCount++;
        }
        return Math.min(tCount, bCount);
    }
}
