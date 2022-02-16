package com.co.pa;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int LongestConsecutive(int[] arr) {
        Arrays.sort(arr);
        return getMaxCount(arr);
    }

    public static void main (String[] args) {
        //6, 7, 3, 1, 100, 102, 6, 12
        //5, 6, 1, 2, 8, 9, 7
        int[] arr = new int[]{6, 7, 3, 1, 100, 102, 6, 12};
        System.out.print(LongestConsecutive(arr));
    }

    public static int getMaxCount(int[] arr) {
        int max = 0;
        Set<Integer> control = new HashSet();
        for(int i = 0; i < (arr.length - 1); i++){
            int current = arr[i];
            int next = arr[(i + 1)];

            if((current + 1) == next) {
                control.add(current);
                control.add(next);
            } else {
                max = control.size() > max ? control.size() : max;
                control = new HashSet<>();
            }
        }
        return control.size() > max ? control.size() : max;
    }
}
