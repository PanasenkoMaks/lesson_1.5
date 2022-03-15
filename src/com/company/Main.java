package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.print(arr[0] + "," + arr[1] + "," + arr[2] + ". ");
        float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};
        System.out.print(arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ". ");
        int[] arr2 = new int[]{23, 34, 44, 45, 23};
        System.out.print(arr2[0] + ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3] +
                ", " + arr2[4] + ".");
        System.out.println("\n" + arr[2] + ", " + arr[1] + ", " + arr[0] + ". ");
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0] + ". ");
        System.out.println(arr2[4] + ", " + arr2[3] + ", " + arr2[2] + ", " + arr2[1] +
                ", " + arr2[0] + ".");
        System.out.println("\n" + "Task 4");
        int a = 0;
        for (int i = 1; i < 4; i++) {
            a++;
        }
        int[] array = new int[a];
        for (int i = 1, b = 0; i < 4; i++) {
            if (i % 2 != 0) {
                array[b] = i +1;
                System.out.println(array[b]);
                b++;
            }
        }
    }
}
