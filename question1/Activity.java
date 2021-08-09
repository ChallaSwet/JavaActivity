import java.util.Scanner;
public class Activity
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the salary");
		int salary=s.nextInt();
		//System.out.println("Enter the number of shifts");
		int shifts=s.nextInt();
		calculateSal(salary,shifts);
		
	}
	public static void calculateSal(int salary,int shifts)
	{
	    double savings=0;
		if(salary>8000)
		{
		    System.out.println("Salary too large");
		}
		    
		    else if(shifts<0)
		    {
		        System.out.println("Shifts too small");
		    }
		        else if(salary<0)
		        {
		            System.out.println("Salary too small");
		        }
		  
		        else
		        {
		            savings = (salary*0.5)+(salary*0.02*shifts);
		            System.out.printf ("%.0f",savings);
		        }
		        
	}
	
		
}
