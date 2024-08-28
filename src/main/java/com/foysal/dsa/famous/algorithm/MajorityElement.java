package com.foysal.dsa.famous.algorithm;

public class MajorityElement {  // LeetCode 169

    //  // Moore's voting algorithm
    public int majorityElement(int[] nums) {
        int me = 0;
        int count = 0;
        for(int num: nums) {
            if(count > 0 && me != num) count--;
            else {
                me = num;
                count++;
            }
        }
        return me;
    }
}
