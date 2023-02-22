import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида <command>~<text>
 * 2. Если введено add~<text> - сохранить text в связный список.
 * 3. Если введено print~<index> - вывести строку из позиции index в связном списке и удалить её из списка.
 */

public class Task141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();

        while(true) {
            System.out.print("Enter the command: ");
            String[] text = sc.nextLine().split("~");

            if (text.length < 2) {
                break;
            }

            switch (text[0]) {
                case "add":
                    addText(text[1], ll);
                    break;
                case "print":
                    printText(text[1], ll);
                    break;
                default:
                    System.out.println("Incorrect input: " + text[0] + "~" + text[1]);
                    break;
            }
        }

        sc.close();
    }

    public static void addText(String input, LinkedList<String> list) {
        list.add(input);
        System.out.println("Added: " + input);
        System.out.println(list.toString());
    }

    public static void printText(String index, LinkedList<String> list) {
        try {
            int ind = Integer.parseInt(index);
            System.out.println("Print: " + list.remove(ind));
            System.out.println(list.toString());
        }
        catch (Exception e) {
            System.out.println("Incorrect index: " + index);
        }
    }
}
