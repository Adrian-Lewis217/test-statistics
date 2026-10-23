package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScore = {17,43,78,79,99,100,91,12,27,35,81};
        Arrays.sort(testScore);
        for (int scores : testScore) {
            System.out.println(Arrays.toString(testScore));
    }
    }
}
