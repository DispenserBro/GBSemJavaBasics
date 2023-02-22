import java.util.Scanner;
import java.util.Stack;

/* 
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и "запоминает" строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная строка была первой в списке, а первая - последней.
*/

public class Task142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.print("Enter the text: ");
            String text = sc.nextLine();

            if (text.isEmpty()) {
                break;
            }

            if ("print".equals(text)) printText(stack);
            else addText(text, stack);
        }

        sc.close();
    }

    public static void addText(String input, Stack<String> stack) {
        stack.push(input);
    }

    public static void printText(Stack<String> stack) {
        while (!stack.empty()) System.out.print(stack.pop() + " ");
        System.out.println();
    }
}
