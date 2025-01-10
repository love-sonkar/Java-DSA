package com.linersearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] array = {1,4,7,2,6,3, 0};
        int findIndex = linearSearch.linerSearchNumber(array, 68);
        System.out.println(findIndex);

        String values = "find me somthingg";
        int findCharIndex = linearSearch.linerSearchChar(values, 't');
        System.out.println(findCharIndex);

        int[] findMinMaxValue = linearSearch.findMinAndMaxNumber(array);
        System.out.println(Arrays.toString(Arrays.stream(findMinMaxValue).toArray()));
    }
}
