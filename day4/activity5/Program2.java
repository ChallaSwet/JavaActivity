import java.util.*;
import java.util.Scanner;
public class Program2
     {
           public static void main(String[] args)
                {
                     Scanner sc=new Scanner(System.in);
                     ArrayList<Integer>a1=new ArrayList<Integer>();
                     System.out.println("Enter the number of matches");
                      int i=sc.nextInt();
                     int c_50=0;
                     int c_100=0;
                     for(int j=1;j<=i;j++)
                       {
                             int a2=sc.nextInt();
                             a1.add(a2);
                          
                    if(a2>=50 && a2<100)
                          {
                              c_50++;
                            }
                     if(a2>=100) {
                         c_100++;
                          }
                  }
                  System.out.println(c_50);
                  System.out.println(c_100);
          }
}
 