import java.util.Scanner;

 class Company
{
    private String name;
    private String employees;
    private String teamlead;
    
    public String getName()
    {
     return name;
    }
    public void setName(String newName)
    {
        this.name=newName;
    }
    public String getEmployees()
    {
        return employees;
    }
    public void setEmployees(String newEmployees)
    {
        this.employees=newEmployees;
    }
    public String getTeamlead()
    {
        return teamlead;
    }
    public void setTeamlead(String newTeamlead)
    {
        this.teamlead=newTeamlead;
    }
    
}
  public class CompanyMain
 {
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Companyname:");
        String name = sc.nextLine();
       System.out.println("Enter the employees:");
        String employees = sc.nextLine();
       System.out.println("Enter the Teamlead:");
        String teamlead = sc.nextLine();
        int flag=0;
		String[] items = employees.split(",");
		for(int i=0;i<items.length;i++) {
			if(teamlead.equalsIgnoreCase(items[i])) {
				flag=1;
			}
		}
                                if(flag==1)
                                {
		//String[] arrDetails = details.split(",");
		Company com = new Company();
                                  com.setName(name);
                                  com.setEmployees(employees);
                                  com.setTeamlead(teamlead);
                                  System.out.println("Name :"+ com.getName());
		System.out.println("Employees : "+ com.getEmployees());
		System.out.println("Teamlead: "+ com.getTeamlead());
                                  }
                                 else
                                  System.out.println("Invalid input");
        }
                          	
 }