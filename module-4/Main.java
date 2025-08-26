//Tevyah Hanley 08/25/2025 M4 Programming Assignment
//This program m

import java.util.Arrays;

public class Main {

    public static short average(short[] array) {
        long sum = 0;
        for (short v : array) sum += v;
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int v : array) sum += v;
        return (int)(sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long v : array) sum += v;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double v : array) sum += v;
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[]  arrShort  = {10, 15, 30};
        int[]    arrInt    = {3, 6, 2, 1};
        long[]   arrLong   = {10_000_000_000L, 11_000_000_000L,
                              30_000_000_000L, 42_000_000_000L,
                              51_000_000_000L};
        double[] arrDouble = {1.5, 2.3};

        System.out.println("My Short Array " + Arrays.toString(arrShort));
        System.out.println(average(arrShort));

        System.out.println("My Int Array " + Arrays.toString(arrInt));
        System.out.println(average(arrInt));

        System.out.println("My Long Array " + Arrays.toString(arrLong));
        System.out.println(average(arrLong));

        System.out.println("My Double Array " + Arrays.toString(arrDouble));
        System.out.println(average(arrDouble));
    }
}
