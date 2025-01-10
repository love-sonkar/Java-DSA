package com.linersearch;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] array = {1,4,7,2,6,3};
        int findIndex = linearSearch.linerSearchNumber(array, 68);
        System.out.println(findIndex);

        String values = "find me somthingg";
        int findCharIndex = linearSearch.linerSearchChar(values, 't');
        System.out.println(findCharIndex);
    }
}
