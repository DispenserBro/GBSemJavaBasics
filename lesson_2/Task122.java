/*
 * Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcdd.
 * результат - a4b3c1d2
 */

import java.util.Scanner;

public class Task122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        sc.close();

        String compressed = rleString(input);
        System.out.println(compressed);
    }

    public static String rleString(String input) {
        int count = 1;
        int i;
        StringBuilder sb = new StringBuilder();

        for (i = 1; i < input.length(); i++)
            if (input.charAt(i) == input.charAt(i-1)) count++;
            else {
                sb.append(input.charAt(i-1)).append(count);
                count = 1;
            }

        sb.append(input.charAt(i-1)).append(count);

        return sb.toString();
    }
}
