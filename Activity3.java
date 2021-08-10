import java.util.Scanner;
public class problem3{ 
static int productDigits(int num)
	{
		int j=1,n;
		while(num>0)
		{
		n=num%10;
		j*=n;
		num/=10;
		}
		return j;

	}

public static void main(String[] args) { 
int n,rem,j; 
Scanner s=new Scanner(System.in); 
System.out.println("Enter the numbers ");
n = s.nextInt(); 
if(n<0 || n>32767) { 
	System.out.println("Invalid Input");
 
	System.exit(0); 
	}
else
	{  
      j=productDigits(n);
	System.out.println(j);


	}
}
}			