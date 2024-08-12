package com.foysal.dsa.arrays;

public class SortColors {  // LeetCode 75
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        mergeSort(left, right, nums);
    }
    private void mergeSort(int left, int right, int[] nums){
        if(left == right || left > right) return;
        int mid = (left +  right) / 2;
        mergeSort(left, mid, nums);
        mergeSort(mid+1, right, nums);
        merge(left, mid, right, nums);
    }

    private void merge(int left, int mid, int right, int[] nums){
        int i = left;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[right-left+1];
        while(i <= mid && j <= right) {
            if(nums[i] <= nums[j]) temp[k++] = nums[i++];
            else if(nums[j] < nums[i])  temp[k++] = nums[j++];
        }
        while(i <= mid)
            temp[k++] = nums[i++];

        while(j <= right)
            temp[k++] = nums[j++];

        int l = left;
        while(l <= right){
            nums[l] = temp[l - left];
            l++;
        }
    }
}
