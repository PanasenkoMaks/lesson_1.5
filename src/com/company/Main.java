package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        for (int i = 0; i < arr.length; i++){
           if (i == arr.length - 1){
               System.out.print(arr[i] + ". ");
                break;
            }
        System.out.print(arr[i] + ", ");
        }

        float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i] + ". ");
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        int[] arr2 = new int[]{23, 34, 44, 45, 88};
        for (int i = 0; i < arr2.length; i++){
            if (i == arr2.length - 1) {
                System.out.print(arr2[i] + ". ");
                break;
            }
            System.out.print(arr2[i] + ", ");
            }
        int n = arr.length;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int t, t2;
        float t1;
        for (int i = 0; i < n/2; i++){
            t = arr[n - i -1];
            arr[n - i -1] = arr[i];
            arr[i] = t;
            t1 = arr1[n1 - i -1];
            arr1[n1 - i -1] = arr1[i];
            arr1[i] = t1;
            t2 = arr2[n2 - i -1];
            arr2[n2 - i -1] = arr2[i];
            arr2[i] = t2;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.print(arr[i] + ". ");
                break;
            }
        System.out.print(arr[i] + ", ");} //не понимаю как не выводить запятую после последнего массива?

        for (int i = 0; i < arr1.length; i++){
            if (i == arr1.length -1){
                System.out.print(arr1[i] + ". ");
            break;}
            System.out.print(arr1[i] + ", ");} //не понимаю как не выводить запятую после последнего массива?

        for (int i = 0; i < n2/2; i++) {
            t2 = arr2[n2 - i - 1];
            arr2[n2 - i - 1] = arr2[i];
            arr2[i] = t2;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i - 4] + ". ");
                break;
            }
            System.out.print(arr2[i] + ", ");
        }//не понимаю почему не меняет последний элемент массива с первым?



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
