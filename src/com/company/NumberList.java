package com.company;

import java.lang.reflect.Array;
import java.util.List;

import static java.lang.reflect.Array.*;
import static java.util.Arrays.asList;

public class NumberList {
    public static void countNumber(Integer[] numbers) {
        List<Integer> numList = asList(numbers);
        for (int i = 0; i < numList.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(numList.get(i));
            }
        }
    }


    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6};
        NumberList.countNumber(numbers);
    }
}

