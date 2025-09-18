package tasks;

import java.util.Scanner;

public class Task1 {
    public static void start(Scanner in) {
        System.out.println("task1");

        // Scanner in = new Scanner(System.in);
        
        System.out.println("1)");
        
        var a1 = in.nextFloat();
        var b1 = in.nextFloat();
        
        double c = a1+((a1+b1-1)/(a1*a1+2))-Math.pow((a1*b1),3);
        
        System.out.println("c = "+c);
        
        System.out.println("2)");

        var a2 = in.nextInt();
        var b2 = in.nextInt();

        c = a2+((a2+b2-1)/(a2*a2+2))-Math.pow((a2*b2),3);
        System.out.println("c = "+c);

        System.out.println("2)");

        a1 = in.nextFloat();
        b1 = in.nextFloat();

        int c2 = (int)(a1+((a1+b1-1)/(a1*a1+2))-Math.pow((a1*b1),3));
        System.out.println("c = "+c2);
        //in.close();
    }
}
