import java.util.Scanner;

 class Employee
{
    private String name;
    private String address;
    private String mobileno;
    
    public String getName()
    {
     return name;
    }
    public void setName(String newName)
    {
        this.name=newName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        this.address=newAddress;
    }
    public String getMobileno()
    {
        return mobileno;
    }
    public void setMobileno(String newMobileno)
    {
        this.mobileno=newMobileno;
    }
    
}
  public class EmployeeMain
 {
     public static void main(String[] args)
     {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:");
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress(address);
                                   emp.setMobileno(mobileno);
                                  System.out.println("Name :"+ emp.getName());
		System.out.println("Address : "+ emp.getAddress());
		System.out.println("Mobileno: "+ emp.getMobileno());
                                 System.out.println("Verify and Update the details :");
                                   int n,flag=0;
                                   n=sc.nextInt();
                                  while(flag==0)
                                 {
                                System.out.println("Menu");
                                System.out.println("1.Update Employee name :");
                                 System.out.println("2.Update Employee address :");
                                 System.out.println("3.Update Eployee Mobileno :");
                                System.out.println("4.All Information are correct/Exit:");
			switch(n){
				case 1:
					System.out.println("Current name is: "+emp.getName());
					System.out.println("Enter the name:");
					sc.nextLine(); 
					String name1 = sc.nextLine();
					emp.setName(name1);
					break;
				case 2:
					System.out.println("Current address is: "+emp.getAddress());
					System.out.println("Enter the address:");
				                 sc.nextLine();
					String address1 = sc.nextLine();
					emp.setAddress(address1);
					break;
				case 3:
					System.out.println("Current mobile is: "+emp.getMobileno());
					System.out.println("Enter the mobile:");
					sc.nextLine();
					String mobile1 = sc.nextLine();
					emp.setMobileno(mobile1);
					break;
				case 4:
					System.out.println("The details are:");
					System.out.println("Name: "+emp.getName());
					System.out.println("Address: "+emp.getAddress());
					System.out.println("Mobileno: "+emp.getMobileno());
					flag=1;
					break;
			}
		}
}
                          	
 }