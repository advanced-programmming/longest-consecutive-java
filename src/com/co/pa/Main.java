package com.co.pa;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int LongestConsecutive(int[] arr) {
        int max = 0;
        Arrays.sort(arr);
        Set<Integer> control = new HashSet<>();
        for(int i = 0; i < (arr.length - 1); i++){
            if((arr[i] + 1) == arr[(i + 1)]) {
                control.add(arr[i]);
                control.add(arr[(i + 1)]);
            } else {
                max = control.size() > max ? control.size() : max;
                control = new HashSet<>();
            }
        }
        return control.size() > max ? control.size() : max;
    }

    public static void main (String[] args) {
        //6, 7, 3, 1, 100, 102, 6, 12 //5, 6, 1, 2, 8, 9, 7
        int[] arr = new int[]{6, 7, 3, 1, 100, 102, 6, 12};
        System.out.print(LongestConsecutive(arr));
    }
}
