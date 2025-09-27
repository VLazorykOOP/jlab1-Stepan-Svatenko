package tasks;

import java.util.Scanner;

public class Task3 {
    public static void start(Scanner in) {
        System.out.println("\ntask3");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("enter");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            boolean symetry = true;
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[i][n - j - 1]) {

                    symetry = false;
                }
            }
            if (symetry) {
                System.out.println("symetry " + (i + 1));
            }
        }

    }
}
