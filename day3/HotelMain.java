import java.util.Scanner;

class HotelRoom
  {
       private String hotelName;
       private int numberOfSqFeet;
       private boolean hasTV;
       private boolean hasWifi;
  
      public String getHotelName()
          {
                return hotelName;
            }
      public void  setHotelName(String hotelName)
             {
                  this.hotelName=hotelName;
             }
      public int getNumberOfSqFeet()
         {
                return numberOfSqFeet;
          }
     public void setNumberOfSqFeet(int numberOfSqFeet) 
          {
                this.numberOfSqFeet=numberOfSqFeet;
           }
     public Boolean getHasTV()
        {
              return hasTV;
          }
    public void setHasTV(boolean hasTV)
       {
              this.hasTV=hasTV;
       }
   public Boolean getHasWifi()
      {
              return hasWifi;
       }
  public void setHasWifi(boolean hasWifi)
     {
            this.hasWifi=hasWifi;
      }
public HotelRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
    {
          super();
          this.hotelName=hotelName;
          this.numberOfSqFeet=numberOfSqFeet;
          this.hasTV=hasTV;
         this.hasWifi=hasWifi;
   } 
   public int calculateTariff(int ratePerSq)
   {
        int rate=(numberOfSqFeet*ratePerSq);
        return rate;
   }
  public int getRatePerSqFeet()
   {
          return 0;
   }
}
  
    class DeluxeRoom extends HotelRoom
        {
            private int  ratePerSqFeet;
             public int getRatePerSqFeet()
                {
                    if(getHasWifi())
                       {
                           return (ratePerSqFeet+2);
                       }  
                        else{
                             return ratePerSqFeet;
                          }
                   }
            public void setRatePerSqFeet(int ratePerSqFeet)
                 {
                      this.ratePerSqFeet=ratePerSqFeet;
                  }
            public DeluxeRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
                  {
                               super(hotelName,numberOfSqFeet,hasTV,hasWifi);;
                               this.ratePerSqFeet=10;
                }
          public DeluxeRoom(String hotelName,int numberOfSqFeet,Boolean hasTV,Boolean hasWifi,int ratePerSqFeet)
            {
                            super(hotelName, numberOfSqFeet, hasTV, hasWifi);
                            this.ratePerSqFeet=ratePerSqFeet;
                }
           
 }
       class  DeluxeSeaViewRoom extends DeluxeRoom
             {
                   public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
	}

	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi,12);
                }
                        
              }
       class SuiteRoom extends HotelRoom
             {
                 private int ratePerSqFeet;
                 public int getRatePerSqFeet()
                    {
                           if(getHasWifi()) {
                              return (ratePerSqFeet+2);  
                                  }
                         else {
                              return ratePerSqFeet;
                               }
                  }
               public void setRatePerSqFeet(int ratePerSqFeet)
                         {
                                   this.ratePerSqFeet=ratePerSqFeet;
                           }  
                   
                    public SuiteRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet)
                     {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public SuiteRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi)
                 {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
                  }
   }
  public  class HotelMain
         {
                public static void main(String[] args) 
              {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Hotel Tariff Calculator"); 
                   int rate=0;
                 System.out.println("1.Deluxe Room"+ "\n"+ "2.Deluxe AC Room" + "\n" + "3.Suit Room");
                 System.out.println("Select Room Type");
                 int ch=sc.nextInt();
                 sc.nextLine();
                System.out.println("Hotel Name:");
		String i = sc.nextLine();
		System.out.println("Room Square Feet Area:");
		int j = sc.nextInt();
		sc.nextLine();
		System.out.println("Room has TV (yes/no):");
		Boolean k = sc.hasNext();
		sc.nextLine();
		System.out.println("Room has Wifi (yes/no):");
		Boolean l = sc.hasNext();
                   if(ch==1)
                       {
                            DeluxeRoom dr=new DeluxeRoom(i,j,k,l);
                            int s=dr.getRatePerSqFeet();
                           System.out.println(s);
                           rate = dr.calculateTariff(s);
                       }
                    else if(ch==2)
                     {
                            DeluxeSeaViewRoom sv=new DeluxeSeaViewRoom(i,j,k,l);
                              int t = sv.getRatePerSqFeet();
		System.out.println(t);
		rate = sv.calculateTariff(t);
	}
              else if(ch == 3) {
		SuiteRoom sr = new SuiteRoom(i,j,k,l);
		int u = sr.getRatePerSqFeet();
		System.out.println(u);
		rate = sr.calculateTariff(u);
	}
	System.out.println("Room Tariff per day is:" + rate);
           }
}

		
                           

        
       
 





