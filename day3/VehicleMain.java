import java.util.Scanner;
  class Vehicle
{
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
   private int cc;
     public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
            {
                                  super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
                }
    
   public  String getMake()
        {
               return make;
         }
  public void  setMake(String newMake)
         {
                this.make=newMake;
         }
  public  String getVehicleNumber()
          {
                   return vehicleNumber;
           }
  public  void  setVehicleNumber(String newVehicleNumber)
          {
                   this.vehicleNumber=newVehicleNumber;
            }
  public String getFuelType()
            {
		return fuelType;
	}
	public void setFuelType(String newfuelType) 
                {
		this.fuelType = newfuelType;
	}
	public int getFuelCapacity() 
               {
		return fuelCapacity;
	}
	public void setFuelCapacity(int newfuelCapacity) 
                  {
		this.fuelCapacity = newfuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int newcc) {
		this.cc = newcc;
	}
               
                        public void displayMake()
	{
		System.out.println("***"+make+"***");
	}
	public void displayDetailInfo()
	{
		
	}
	public void displayBasicInfo()
	{
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:"+this.vehicleNumber);
		System.out.println("Fuel Capacity:"+this.fuelCapacity);
		System.out.println("Fuel Type:"+this.fuelType);
		System.out.println("cc:"+this.cc);
		
	}
}
 
                    class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;

	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		String s1=isKickStartAvailable()?"YES":"NO";
		System.out.println("Kick Start Available:"+s1);
		
	}
	
}
 class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+this.audioSystem);
		System.out.println("Number of Doors:"+this.numberOfDoors);
	}
	
	
}
public class VehicleMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n"+ "2.Two Wheeler\n"+"Enter Vehicle Type:");
		int ch=scan.nextInt();
		if(ch==1)
		{
			
			System.out.println("Vehicle Make:");
			String make=scan.next();
			System.out.println("Vehicle Number:");
			String Vehicle_number=scan.next();
			System.out.println("Fuel Type:\n"+"1.Petrol\n"+"2.Diesel");

			int ch2=scan.nextInt();
			String fueltype=(ch2==1)?"Petrol":"Diesel";
			System.out.println("Fuel Capacity:");
			int fuel_capacity=scan.nextInt();
			System.out.println("Engine CC:");
			int cc=scan.nextInt();
			System.out.println("Audio System:");
			String audio_system=scan.next();
			System.out.println("Number of Doors:");
			int doors=scan.nextInt();
			
			FourWheeler f1=new FourWheeler(make, Vehicle_number, fueltype, fuel_capacity, cc, audio_system, doors);
			f1.displayMake();
			f1.displayBasicInfo();
			f1.displayDetailInfo();

		}
		else
			if(ch==2)
			{
				System.out.println("Vehicle Make:");
				String make=scan.next();
				System.out.println("Vehicle Number:");
				String Vehicle_number=scan.next();
				System.out.println("Fuel Type:\n"+"1.Petrol\n"+"2.Diesel");

				int ch2=scan.nextInt();
				String fueltype=(ch2==1)?"Petrol":"Diesel";
				System.out.println("Fuel Capacity:");
				int fuel_capacity=scan.nextInt();
				System.out.println("Engine CC:");
				int cc=scan.nextInt();
				System.out.println("Kick Start Available(yes/no):");
				String s1=scan.next();
				boolean kick_start=(s1.equals("yes"));
				
				TwoWheeler t1=new TwoWheeler(make, Vehicle_number, fueltype, fuel_capacity, cc, kick_start);
				t1.displayMake();
				t1.displayBasicInfo();
				t1.displayDetailInfo();
				
			}
			else{
				System.out.println("Invalid Input");
			}
		
	}

}
                              

              