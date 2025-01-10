package com.linersearch;

public class LinearSearch {
    public int linerSearchNumber(int[] array, int target) {
        if(array.length == 0 ) return -1;
        for(int i =0; i< array.length; i++) {
            int element = array[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }

    public int linerSearchChar(String value, char target) {
        if(value.isEmpty()) {
            return -1;
        }
        for(int i = 0; i < value.length(); i++) {
            char element = value.charAt(i);
            if(element == target) {
                return i;
            }
        }
        return -1;
    }

    public int[] findMinAndMaxNumber(int[] values){
        if(values.length == 0) return new int[]{};
        int minValue = values[0];
        int maxValue = values[0];
        for(int element: values) {
            if(element < minValue) {
                minValue = element;
            }
            if(element > maxValue) {
                maxValue = element;
            }
        }
        return new int[]{minValue, maxValue};
    }
}