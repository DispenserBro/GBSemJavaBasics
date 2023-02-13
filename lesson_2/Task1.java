/*
 * Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 * 
 * Ввод: 6 a b
 * Вывод: ababab
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите четное число N (>0) и символы c1 и c2: ");
        String[] input = sc.nextLine().split(" ");

        int count = Integer.parseInt(input[0]);
        String chr1 = input[1];
        String chr2 = input[2];

        String result = charSequence(count, chr1, chr2);

        System.out.println(result);

        sc.close();
    }

    public static String charSequence(int count, String chr1, String chr2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            if(i % 2 == 0) sb.append(chr1);
            else sb.append(chr2);
        }

        return sb.toString();
    }
}
