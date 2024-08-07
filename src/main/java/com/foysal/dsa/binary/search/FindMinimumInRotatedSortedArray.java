package com.foysal.dsa.binary.search;

public class FindMinimumInRotatedSortedArray { // LeetCode 153
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            if(nums[left] <= nums[right]) { // if the range is sorted left is obviously smallest
                ans = Math.min(nums[left], ans);
                break;
            }
            int mid = left + (right - left) / 2;

            if(nums[mid] <= nums[right]) {  // if the mid to right is sorted mid is obviously smallest
                ans = Math.min(nums[mid], ans);
                right = mid-1;
            }
            else {                   // if mid to right is not sorted obviously left to mid is sorted and left is smallest
                ans = Math.min(nums[left], ans);
                left = mid + 1;
            }
        }
        return ans;
    }
}
