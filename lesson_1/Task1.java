import java.util.Random;

//* Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[] {0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1};
        int counter = 0;
        int tempMax = 1;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1] && array[i] == 1) tempMax++;
            else tempMax = 1;

            if (tempMax > counter) counter = tempMax;
            // counter = tempMax > counter ? tempMax : counter;
        }

        System.out.println(counter);
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