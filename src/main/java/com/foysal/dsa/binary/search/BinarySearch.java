package com.foysal.dsa.binary.search;

public class BinarySearch {  // LeetCode 704
    public int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                low = mid + 1;
            }
            if (array[mid] > value) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
