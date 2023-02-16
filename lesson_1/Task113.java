import java.util.Arrays;
import java.util.Scanner;

//* Считать фразу и переставить слова в обратном порядке.

public class Task113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите фразу: ");
        String phrase = sc.nextLine();
        sc.close();

        System.out.println(phrase);

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length/2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // String res = "";

        // for (int i = words.length - 1; i > -1 ; i--) {
        //     res += words[i];
        // }

        String out = String.join(" ", words);
        String out1 = Arrays.toString(words);
        System.out.println(out);
        System.out.println(out1);
    }
}
