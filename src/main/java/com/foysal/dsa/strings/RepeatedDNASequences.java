package com.foysal.dsa.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {   // LeetCode 187

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String dna = s.substring(i, i + 10);
            if(set.contains(dna)) {
                result.add(dna);
            } else {
                set.add(dna);
            }
        }
        return new ArrayList<>(result);
    }
}
