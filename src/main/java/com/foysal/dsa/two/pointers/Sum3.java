package com.foysal.dsa.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {  // LeetCode 15

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        int l, r, total, target;
        for (int i = 0; i < len-2; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            l = i+1;
            r = len - 1;
            total = 0;
            target = -nums[i];
            while (l < r) {
                total = nums[l] + nums[r];
                if (total == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]) l++;
                    while(r > l && nums[r] == nums[r+1]) r--;
                } else if (total > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

}
