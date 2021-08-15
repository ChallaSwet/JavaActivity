import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class RunRate {
    public static void main(String[] args)
             
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
           System.out.println("enther the total runs scored");
        double runs=Integer.parseInt(br.readLine());

        System.out.println("enter the no of overs");
        double overs=Integer.parseInt(br.readLine());

            DecimalFormat dec = new DecimalFormat("#0.00");
            double total=(runs/overs);
            System.out.println("current runrate"+(dec.format(total)));
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}