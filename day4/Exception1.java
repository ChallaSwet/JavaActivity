import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("enter no of overs");

            int n=sc.nextInt();

             int a[]=new int[n];
            System.out.println("enter runs in each over");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("enter over number");
            int in=sc.nextInt();
            System.out.println("runs scored this over is:"+a[in-1]);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}