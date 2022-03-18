package example1;

import java.util.*;

public class determineGrads {
    public static void main(String args[]) {
        int n = 23;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Percentage to get your Grade ");
        n = scn.nextInt();
        if (100 >= n && 90 <= n) {
            System.out.println("A+");
        } else if (90 >= n && 80 <= n) {
            System.out.println("A");
        } else if (80 >= n && 70 <= n) {
            System.out.println("B+");
        } else if (70 >= n && 60 <= n) {
            System.out.println("B");
        } else if (60 >= n && 50 <= n) {
            System.out.println("C");
        } else if (50 >= n && 40 <= n) {
            System.out.println("B");
        } else if (40 >= n && 35 <= n) {
            System.out.println("D");
        } else if (35 > n) {
            System.out.println("Failed");
        }

        scn.close();
    }

}
