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
}
