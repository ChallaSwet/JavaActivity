import java.util.Scanner;
public class Activity2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int i;
        int n=s1.length();
        String firstLetStr = s1.substring(0, 1);
        String remLetStr = s1.substring(1);
        firstLetStr = firstLetStr.toUpperCase();
        String s4 = firstLetStr + remLetStr;
           String s2upper=s2.toUpperCase();  
           System.out.println(s4 + s2upper);
    }
}