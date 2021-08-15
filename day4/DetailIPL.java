import java.util.Scanner;

public class DetailIPL extends Throwable {
 

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);

       try {
            String name = sc.next();

            int age = sc.nextInt();
            if(age<19){
                throw new IPL();
            }
           System.out.println(name);
           System.out.println(age);
        } catch (DetailIPL DetailIPL) {
          
           System.out.println("invalidAgeRangeException");
       }
    }
}