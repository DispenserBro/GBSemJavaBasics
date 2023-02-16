/*
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
 * а остальные - равны ему.
 * 
 * Пример
 * 1 2 3 4 5 6 3
 * 0 0 0 0 0 3 3
 * Вывод 
 * 1 2 4 5 6 3 3
 */

import java.util.Random;

public class Task112 {
    public static void main(String[] args) {
        int[] array = genRandomArray(20, 5);
        showArray(array);

        int[] secArray = sortValue(array, 4);

        showArray(secArray);
    }

    public static int[] sortValue(int[] array, int value) {
        int[] secArray = new int[array.length];
        int defIndex = 0;
        int indexVal = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                secArray[indexVal] = array[i];
                indexVal--;
            }
            else {
                secArray[defIndex] = array[i];
                defIndex++;
            }
        }

        return secArray;
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static int[] genRandomArray(int size, int maxValue) {
        int[] array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValue);
        }

        return array;
    }
}
