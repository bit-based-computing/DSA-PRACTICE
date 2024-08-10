package com.foysal.dsa.arrays;

public class CanPlaceFlowers {  // LeetCode 605

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean isLeftEmpty = i - 1 < 0 || flowerbed[i - 1] == 0;
                boolean isRightEmpty = i + 1 >= len || flowerbed[i + 1] == 0;
                if (isLeftEmpty && isRightEmpty) {
                    n--;
                    i++;
                }
            }
        }
        return n == 0;
    }

}
