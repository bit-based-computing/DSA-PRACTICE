package com.foysal.dsa.strings;

public class IntegerToEnglishWords { // LeetCode 273

    String[] lessThanTwenty = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ",
            "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    String[] tens = {"", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    String hundred = "Hundred ";
    String[] thousand = {"", "Thousand ", "Million ", "Billion "};

    public String numberToWords(int integer) {
        if(integer == 0) return "Zero";
        String word = "";
        int i = 0;
        while (integer > 0) {
            int hundredth = integer % 1000;
            if(hundredth > 0) word = helper(hundredth) + thousand[i] + word;
            integer = integer / 1000;
            i++;
        }
        return word.trim();
    }

    private String helper(int n) {
        if (n < 20) {
            return lessThanTwenty[n];
        } else if (n < 100) {
            return tens[n / 10] + helper(n % 10);
        } else {
            return lessThanTwenty[n / 100] + hundred + helper(n % 100) ;
        }
    }
}

