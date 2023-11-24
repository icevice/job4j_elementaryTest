package ru.job4j.array;

public class Square {
    public static double[] calculate(int bound) {
        double[] rst = new double[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = Math.pow(i, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        double[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}