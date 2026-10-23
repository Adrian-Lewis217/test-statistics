package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScore = {73,43,78,79,99,100,91,75,27,35,81};
        Arrays.sort(testScore);

        int[] highScore = new int[0];
        int[] lowScore = new int[0];
        int[] average = new int[0];

        System.arraycopy(testScore,0,lowScore,0,3);
        System.arraycopy(testScore,0,highScore,0,3);
        System.arraycopy(testScore,0,average,0,3);


        for (int scores : testScore) {
            System.out.println(Arrays.toString(testScore));
        }

        for (int score : lowScore) {
            System.out.println(Arrays.toString(lowScore));
        }
    }
}
