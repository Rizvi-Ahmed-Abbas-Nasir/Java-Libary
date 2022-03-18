package java_exmProject;

import java.util.*;

public class javaExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = { 55, 34, 434, 535 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println(" ");

        String[] arrayOfStrings = { "Abbas", "Rizvi", "Ahemd" };
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print(arrayOfStrings[i]);
            System.out.print(" ");
        }

        scn.close();
    }

}
