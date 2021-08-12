import java.util.Scanner;

 class Innings
{
    private String teamname;
    private String inningsname;
    private int runs;
    
    public String getTeamname()
    {
     return teamname;
    }
    public void setTeamname(String newTeamname)
    {
        this.teamname=newTeamname;
    }
    public String getInningsname()
    {
        return inningsname;
    }
    public void setInningsname(String newInningsname)
    {
        this.inningsname=newInningsname;
    }
    public int getRuns()
    {
        return runs;
    }
    public void setRuns(int newRuns)
    {
        this.runs=newRuns;
    }
    public void displayInningsDetails()
    {
		System.out.println("Name: "+teamname);
		System.out.println("Scored: "+runs);
		System.out.println("Session: "+inningsname);
	}
}
  public class InningsMain
 {
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        Innings inn=new Innings();
        //String teamname;
        //String inningsname;
        //int runs;
        System.out.println("Enter the teamname");
        String teamname=sc.nextLine();
        System.out.println("Enter sessions");
        String inningsname=sc.nextLine();
        System.out.println("Enter runs");
        int runs=sc.nextInt();
        inn.setTeamname(teamname);
		inn.setInningsname(inningsname);
		inn.setRuns(runs);
		inn.displayInningsDetails();
                          	if(inningsname.equalsIgnoreCase("First"))
                                {
		System.out.println("Need "+ (runs+1) + " to win"); }
		else{
			System.out.println("Match Ended."); }
     }
 }