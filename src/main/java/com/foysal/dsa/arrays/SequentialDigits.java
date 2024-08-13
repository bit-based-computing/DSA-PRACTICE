package com.foysal.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {  // LeetCode 1291
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            int number = i;
            for(int j = i + 1; j <=9; j++){
                number = number*10 + j;
                if(number >= low && number <= high){
                    ans.add(number);
                }
                if(number > high) break;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
