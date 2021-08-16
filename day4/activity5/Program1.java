
import java.util.*;
import java.util.Scanner;
     public class Program1
          {
             public static void main(String[] args)
              {
            Scanner sc =new Scanner(System.in);
              ArrayList<String> a1 =new ArrayList<String>();
              System.out.println("Enter the top 5 scorers of IPL 13");
            for(int i=1;i<=5;i++)
                 {
                     String a2=sc.nextLine();
                     a1.add(a2);
               }
              ArrayList<String> a3=new ArrayList<String>();
             System.out.println("Enter the top 5 scorers of IPL 12");
              for(int i=1;i<=5;i++)
                 {
                       String a2=sc.nextLine();
                       a3.add(a2);
                 }
             a1.retainAll(a3);
             System.out.println("Consistent run scores:"+a1);
      }  
}