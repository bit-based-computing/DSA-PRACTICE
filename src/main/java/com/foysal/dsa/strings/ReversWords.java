package com.foysal.dsa.strings;

public class ReversWords {
    public String reverseWords(String s) {  //LeetCode 151
        int len = s.length();
        int left = 0;
        int right = len - 1;
        char[] chars = s.toCharArray();
        reverseWord(left, right, chars);
        System.out.println(new String(chars));
        left = 0;
        right = 0;
        while (left < len ) {
            while (right < len && chars[right] == ' ') {
                right++;
            }
            while(right < len && chars[right] != ' ') {
                chars[left++] = chars[right++];
            }
            if(left < len) chars[left] = ' ';
            right++;
            left++;
        }
        System.out.println(new String(chars));
        left = 0;
        right = 0;
        while(left < len ) {
            while(right < len && chars[right] != ' ') {
                right++;
            }
            reverseWord(left, right-1, chars);
            right = right + 1;
            left = right;

        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(chars[0]);
        for (int i = 1; i < len; i++) {
            if(chars[i] == ' ' && chars[i-1] == ' ') break;
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString().trim();
    }
    private void reverseWord(int left, int right, char[] chars) {
        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
