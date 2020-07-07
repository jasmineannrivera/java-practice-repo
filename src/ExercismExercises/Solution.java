package ExercismExercises;


import java.util.*;

public class Solution {
    static void solution(int[] A) {
        //sort array
        Arrays.sort(A);
        //one will always be the lowest positive number possible
        int min = 1;
        //declare array length var
        int length = A.length;
        //loop through each index of A
        for (int i = 0; i < length; i++){
            // if index i is 1 iterate
            if(A[i] == min){
                min++;
            }
        }
        System.out.println(min);
    }



}