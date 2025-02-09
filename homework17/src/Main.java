import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        palindrome();
    }

    static void timer()
    {
        System.out.println("Введіть кількість секунд: ");
        Scanner s = new Scanner(System.in);
        int sec = parseInt(s.nextLine());
        Thread t = new TimerThread(sec);
        t.start();
    }

    static void wordCount()
    {
        System.out.println("Введіть текст: ");
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        String[] words = txt.split(" ");
        List<String> wordsArray = Arrays.asList(words);
        int count = 0;
        for (int i = 0; i < wordsArray.size(); i++) {
            if (wordsArray.get(i) != "") {
                count++;
            }
        }
        System.out.println("Кількість слів: " + count);
    }

    static void palindrome()
    {
        System.out.println("Введіть текст: ");
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();

        String reverseTxt = "";
        for(int i = txt.length() - 1; i >=0 ; i--) {
            reverseTxt += txt.charAt(i);
        }

        System.out.printf("Слово є паліндромом: %s\n", txt.equals(reverseTxt) ? "так" : "ні" );
    }
}