package lesson01.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Массивы
        // Ссылочный тип данных
        // int[] array = new int[3]; | {0, 0, 0}
        // boolean[] array = new boolean[3]; | {false, false, false}
        // int[] arr = {1, 2, 3, 4, 5}; | {1, 2, 3, 4, 5}
        // int[] arr = new int[] {1, 2, 3, 4, 5}; | {1, 2, 3, 4, 5}
        // arr[-1]; // ArrayIndexOutOfBoundsException
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        arr[1] = 123;
//        // arr.length - длина массива
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//
//        String[] ar = {"Hello", "World"};
//        ar[0] = "World";
//        ar[1] = "Hello";
//        for (int i = 0; i < ar.length; i++) {
//            System.out.print(ar[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(ar));
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            if (arr[i] % 2 == 0) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println(sum);

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            if (i % 2 == 0) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println(sum);
//        int[] ar1 = {1, 2, 3};
//        int[] ar2 = {9, 8, 7};
////        int[][] ar3 = new int[n][n]; | n = 3
//        ar2 = ar1; // Когда первый массив присваивается второму, то первый массив теряет свои ссылки
//        ar1[0] = 123;
//        System.out.println(Arrays.toString(ar2));
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] matrix = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = in.nextInt();
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(Arrays.deepToString(matrix));
    }
}
