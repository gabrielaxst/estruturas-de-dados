package entities;

import java.util.Arrays;
public class Calculate {
    public static double mean(int[] vector){
       int sum = 0;
       for (int i = 0; i < vector.length; i++){
           sum += vector[i];
       }
       return (double) sum / vector.length;
    }
    public static int median(int[] vector){
        Arrays.sort(vector);
        if(vector.length % 2 == 0) {
            return (vector[vector.length / 2 - 1] + vector[vector.length / 2]) / 2;
        }
        return vector[((vector.length + 1) / 2) - 1];
    }
    public static int mode(int[] vector){
        int maxCount = 0;
        int count = 0;
        int mostFrequentElement = 0;
        for (int i = 0; i < vector.length; i++){
            for (int j = 1; j < vector.length; j++){
                if (vector[i] == vector[j]){
                    count++;
                }
                if (count > maxCount){
                    maxCount += count;
                    mostFrequentElement = vector[i];
                }
            }
        }
        return mostFrequentElement;
    }
}
