import java.util.*;
import java.util.Scanner;
import java.util.HashSet;
   public class Program3
           {
     public static void main(String[] args)
           {
                   Scanner sc=new Scanner(System.in);
                    int n=Integer.parseInt(sc.nextLine());
               HashSet<String> hset=new HashSet<String>();
                  for(int i=0;i<=n;i++)
                     {
                          
                          hset.add(sc.nextLine());
                     }
                  System.out.println(hset);
                   System.out.println(hset.size());
            }
   } 
              