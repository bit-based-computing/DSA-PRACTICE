package com.foysal.dsa.strings;

import java.util.Stack;

public class DecodeString {  // LeetCode 394
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numStack.push(num);
            } else if(c == '[') {
                strStack.push(sb.toString());
                sb.setLength(0);
            } else if(c == ']') {
                int times = numStack.pop();
                String temp = strStack.isEmpty()? "" : strStack.pop();
                for(int j = 0; j < times; j++) {
                    temp = temp+sb.toString();
                }
                sb.setLength(0);
                sb.append(temp);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
