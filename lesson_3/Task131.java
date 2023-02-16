import java.util.*;

//* Заполнить список десятью случайными числами. Отсортировать список методом sort()
//* и вывести его на экран

public class Task131 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        randFillList(10, 100, intList);
        intList.sort(null);

        System.out.println(intList);

        for (Integer number : intList) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
    }

    public static void randFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }
}
