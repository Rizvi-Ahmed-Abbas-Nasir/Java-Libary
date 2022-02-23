import java.util.*;

public class java1 {
    public static void main(String[] args) {
        // System.out.println("Abbas");
        Scanner TakeInput = new Scanner(System.in);
        // System.out.print("Enter Your Name");
        // String name = scanner.nextLine();
        // System.out.println(name);
        // int i ;
        // for( i = 0;i <= 10; i++)
        // {
        //     System.out.println(i);
        // }
        System.out.print("Enter Value to Increment: ");
        int Num = TakeInput.nextInt();
        System.out.print("Enter Value Element Stop At: ");
        int a = TakeInput.nextInt();

        while(Num <= a)
        {
            System.out.println(Num);
            Num++;
        }

        
    TakeInput.close();
    }
        
    
}