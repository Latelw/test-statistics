package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        System.out.println("==AVERAGE==");
        int[] testScores = new int[10];
        testScores = new int[]{56, 67, 75, 88, 86, 99, 34, 72, 92, 97};
        //Use a loop to add every score then divide for average
        int count = 0;
        for (int i = 0; i < testScores.length ; i++) {
           count = testScores[i] + count;

        }
        double average = (double) count / testScores.length;

        System.out.println(average);
        System.out.println("==Low score and High score==");
        // Find high and low  with one loop
        int highScore = 0;
        int lowScore = 0;
        for (int i = testScores[0]; i < testScores.length; i++) {
            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }
            if (testScores[i] < lowScore){
                lowScore = testScores[i];
        }
        }
        System.out.println(lowScore);
        System.out.println(highScore);

    }
}
