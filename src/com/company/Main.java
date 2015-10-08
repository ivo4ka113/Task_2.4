package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] a = {"Art",
                "December",
                "Yacht",
                "Club",
                "And",
                "On",
                "went"};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
