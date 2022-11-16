package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int arr = array.length - 1;
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[arr - i];
            array[arr - i] = temp;
        }
        return array;
    }
}