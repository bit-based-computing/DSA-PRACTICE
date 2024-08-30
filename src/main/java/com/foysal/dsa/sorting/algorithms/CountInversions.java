package com.foysal.dsa.sorting.algorithms;

public class CountInversions { // GFG

    static long inversionCount(long arr[], int n) {
        return divide(0, n-1, arr);
    }

    private static long divide(int left, int right, long[] nums) {
        if(left < right) {
            long globalInv = 0;
            int mid = left + (right-left)/2;
            globalInv += divide(left, mid, nums);
            globalInv += divide(mid+1, right, nums);

            long[] temp = new long[right - left + 1];
            int i = left;
            int j = mid + 1;
            int k = 0;
            while(i <= mid && j <= right) {
                if (nums[i] <= nums[j]) {
                    temp[k++] = nums[i++];
                } else {
                    globalInv += (mid - i + 1);
                    temp[k++] = nums[j++];
                }
            }
            while (i <= mid) {
                temp[k++] = nums[i++];
            }
            while (j <= right) {
                temp[k++] = nums[j++];
            }
            for(i = left; i <= right; i++) {
                nums[i] = temp[i-left];
            }
            return globalInv;
        }
        return 0;
    }
}
