package tasks;

import java.util.Scanner;

public class Task3 {
    public static void start( Scanner in) {
        System.out.println("task3");
//          Задана цілочислова матриця
// An, n, n  20
// . Розробити програму, яка знаходить і друкує
// номери тих рядків, елементи яких утворюють симетричні послідовності 1, 2, 3, 3, 2, 1 або 1, 2,
// 3, 5,3, 2, 1
        // Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        // check symetry
        
        for (int i = 0; i < n; i++) {
            boolean symetry = true;
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    symetry = false;
                }
            }
            if (symetry) {
            System.out.println("symetry "+i);
        }
        }
        //in.close();
        

        
    }
}
