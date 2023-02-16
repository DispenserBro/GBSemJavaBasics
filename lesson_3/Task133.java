import java.util.*;

/* 
 * Создать список типа ArrayList.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */

public class Task133 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        randFillList(20, list);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

    public static void randFillList(int count, ArrayList list) {
        Random rand = new Random();
        
        for (int i = 0; i < count; i++) {
            if (rand.nextInt(count) > 10) list.add(rand.nextInt(100));
            else list.add("hello");
        }
    }
}
