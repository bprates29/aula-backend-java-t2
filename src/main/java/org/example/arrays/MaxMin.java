package org.example.arrays;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100043, 18, -999, 5673, 7289, -6, 321, 46};

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i <= 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }


        System.out.println("Mínimo: " + min);
        System.out.println("Maximo: " + max);
//        System.out.println("toString: " + nums.toString());
    }
}
