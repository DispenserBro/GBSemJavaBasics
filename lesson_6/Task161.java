import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task161 {
    public static void main(String[] args) {
        HashSet<Integer> intSet1 = new HashSet<>(Arrays.asList(1, 1000, 3000, 2, 4, 5, 60000000, 3));
        LinkedHashSet<Integer> intSet2 = new LinkedHashSet<>(Arrays.asList(1, 1000, 3000, 2, 4, 5, 60000000, 3));
        TreeSet<Integer> intSet3 = new TreeSet<>(Arrays.asList(1, 1000, 3000, 2, 4, 5, 60000000, 3));

        System.out.println(intSet1);
        System.out.println(intSet2);
        System.out.println(intSet3);
    }
}
