package com.foysal.dsa.arrays;

public class GasStation {  // LeetCode 134
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int station = 0;
        int startStation = 0;
        int lastStation = len + len - 1;
        int fuel = 0;
        while (station <= lastStation && startStation < len) {
            if(station - startStation == len) return startStation;
            int index = station % len;
            fuel += gas[index] - cost[index];
            if(fuel < 0) {
                fuel = 0;
                station++;
                startStation = station;
            } else {
                station++;
            }
        }
        return -1;
    }

    // another way
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int len = gas.length;
        int start = 0;
        int fuel = 0;
        int low = 0;
        for (int i = 0; i < len; i++) {
            fuel += gas[i] - cost[i];
            if(fuel < low) {
                start = i+1;
                low = fuel;
            }
        }
        if(fuel < 0) return -1;
        return start % len;
    }
}
