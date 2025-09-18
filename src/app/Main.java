package app;

import java.util.Scanner;
import tasks.Task1;
import tasks.Task2;
import tasks.Task3;
import tasks.Task4;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Lab 1 Java");
        Scanner in = new Scanner(System.in);
        Task1.start(in);
        Task2.start(in);
        Task3.start(in);
        Task4.start(in);
        in.close();

        // System.out.printf("test");

        // 13. Задано масив цілих чисел
        // An, n  500
        // . Розробити програму, яка вилучає із
        // A
        // всі числа, які
        // повторюються більше трьох разів, а масив ущільнює
    }
}
