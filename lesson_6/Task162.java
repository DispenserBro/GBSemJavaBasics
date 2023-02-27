import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task162 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        randFillArrayList(intArr, 100, 1000);
        // System.out.println(intArr);
        System.out.println(uniquePercent(intArr));
    }

    public static void randFillArrayList(ArrayList<Integer> array, int maxValue, int elsCount) {
        Random random = new Random();

        for (int i = 0; i < elsCount; i++) {
            array.add(random.nextInt(maxValue + 1));
        }
    }

    public static double uniquePercent(ArrayList<Integer> array) {
        HashSet<Integer> unique = new HashSet<>(array);
        double uniqueCount = (double) unique.size();

        return uniqueCount * 100 / (double) array.size();
    }
}
