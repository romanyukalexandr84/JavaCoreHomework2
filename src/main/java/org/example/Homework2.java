package org.example;

public class Homework2 {
    public static int countEvens (int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int diff (int[] arr) {
        int minElem = arr[0];
        int maxElem = arr[0];
        for (int elem : arr) {
            if (elem < minElem) {
                minElem = elem;
            }
            if (elem > maxElem) {
                maxElem = elem;
            }
        }
        return maxElem-minElem;
    }

    public static boolean isTwoZeroElements (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i-1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] mas = new int[] {1,45,-7,18,0,0,78,15,-16,12,64};
        System.out.println("Количество чётных элементов в массиве = " + countEvens(mas));
        System.out.println("Разница между самым большим и самым маленьким элементами массива = " + diff(mas));
        System.out.println("Наличие двух соседних элементов с нулевым значением = " + isTwoZeroElements(mas));
    }
}