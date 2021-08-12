import java.util.Scanner;

 class Customer
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
  public class CustomerMain
 {
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:");
        String details = sc.nextLine();
		String[] arrDetails = details.split(",");
		Customer cust = new Customer();
		cust.setName(arrDetails[0]);
		cust.setAddress(arrDetails[1]);
                                   cust.setMobileno(arrDetails[2]);
		//cust.setMobileno(arrDetails[2]);
		//cust.setDisplayCustomerDetails();
                                  System.out.println("Name :"+ cust.getName());
		System.out.println("Address : "+ cust.getAddress());
		System.out.println("Mobileno: "+ cust.getMobileno());
}
                          	
 }