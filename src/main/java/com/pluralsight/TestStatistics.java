package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScore = {73,43,78,79,99,100,91,75,27,35,81};
        Arrays.sort(testScore);
        System.out.println(Arrays.toString(testScore));
        System.out.println();

        int[] lowScore = new int[3];
        int[] highScore = new int[4];
        int[] average = new int[4];

        System.arraycopy(testScore,0,lowScore,0,3);
        System.arraycopy(testScore,7,highScore,0,4);
        System.arraycopy(testScore,3,average,0,4);

        System.out.println(Arrays.toString(testScore));
        System.out.println(Arrays.toString(lowScore));
        System.out.println(Arrays.toString(highScore));
        System.out.println(Arrays.toString(average));
    }
}
