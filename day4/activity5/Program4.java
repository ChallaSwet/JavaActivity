import java.util.*;
import java.util.Scanner;
import java.util.TreeSet;
   public class Program4
           {
     public static void main(String[] args)
           {
                   Scanner sc=new Scanner(System.in);
                    int n=Integer.parseInt(sc.nextLine());
               TreeSet<String> t1=new TreeSet<String>();
                  for(int i=0;i<n;i++)
                        {
                            t1.add(sc.nextLine());
                          }
                  System.out.println(t1);
             }
  }