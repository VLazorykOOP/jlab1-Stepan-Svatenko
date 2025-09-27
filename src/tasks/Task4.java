package tasks;

import java.util.Scanner;

public class Task4 {
    public static void start(Scanner in) {
        System.out.println("task4");
        in.nextLine();
        System.out.println("enter");
        String s = in.nextLine();
        String[] words = s.split("\\s+");
        for (String word : words) {
            boolean sorted = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < word.charAt(i - 1)) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println(word);
            }
        }

    }

}
