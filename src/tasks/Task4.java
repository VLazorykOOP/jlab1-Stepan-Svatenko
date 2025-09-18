package tasks;

import java.util.Scanner;

public class Task4 {
    public static void start(Scanner in) {
        // Задано текст із малих латинських літер, слова в якому розділені пробілами і
        // розділовими
        // знаками. Розробити програму, яка знаходить і друкує всі слова з літерами,
        // розміщеними в
        // лексикографічному порядку.
        System.out.println("task4");
        in.nextLine();
        String s = in.nextLine();
        String[] words = s.split("\\s+");
        // for (String word : words) {
        // System.out.println(word);
        // }
        // sort letter in words

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
        // in.close();
    }

}
