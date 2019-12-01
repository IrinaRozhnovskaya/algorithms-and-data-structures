package com.javarush.task;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {10, 2, 10, 3, 1, 2, 5};

        bubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));  //expected: [1, 2, 2, 3, 5, 10, 10]

    }
}
