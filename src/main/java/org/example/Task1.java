package org.example;

public class Task1 {
    public static int countEvens (int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] mas = new int[] {1,45,-7,18,0,78,15,-16,12,64};
        System.out.println("Количество чётных элементов в массиве = " + countEvens(mas));
    }
}