package tasks;

import java.util.Scanner;

public class Task2 {
    public static void start(Scanner in) {
        System.out.println("task2");
//         13. Задано масив цілих чисел
// An, n  500
// . Розробити програму, яка вилучає із
// A
// всі числа, які
// повторюються більше трьох разів, а масив ущільнює
        // Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        int count; 
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count < 3) {
                b[i] = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (b[i] != 0) {
                System.out.print(b[i] + " ");
            }
        }
        //in.close();
    }
}
