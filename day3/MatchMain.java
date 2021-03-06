import java.util.Scanner;
abstract class Match {

	private int currentscore;
	private float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public Match(int currentscore, float currentover, int target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);
}
class ODIMatch extends Match {

	public ODIMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
	}
	

	float calculateRunRate() {
	float run = (getTarget()-getCurrentscore())/(50-getCurrentover());
		return run;
	}
	int calculateBalls() {
	int ball = (int) ((50-getCurrentover()) * 6);
		return ball;
	void display(double reqRunrate, int balls) {
	System.out.println("Requirements: " + "\n" + "Need " + (getTarget()-getCurrentscore()) +" runs in " +  balls + " balls"+ "\n" + "Required Runrate: " + reqRunrate);
		
	}

}
class TestMatch extends Match {

	public TestMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}

	float calculateRunRate() {
		float run = (getTarget()-getCurrentscore())/(90-getCurrentover());
		return run;
	}
	int calculateBalls() {
		int ball = (int) ((90-getCurrentover()) * 6);
		return ball;
	}
	void display(double reqRunrate, int balls) {
	
		System.out.println("Requirements: " + "\n" + " Need " + (getTarget()-getCurrentscore()) +" runs in " +  balls + " balls"+ "\n" + "Required Runrate: " + reqRunrate );

	}

}
 class T20Match extends Match {

	
	public T20Match(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}

	float calculateRunRate() {
		float run = (getTarget()-getCurrentscore())/(20-getCurrentover());
		return run;
		
	}

	int calculateBalls() {
		int ball = (int) ((20-getCurrentover()) * 6);
		return ball;
		
	}

	void display(double reqRunrate, int balls) {
		System.out.println("Requirements: " + "\n" + " Need " + (getTarget()-getCurrentscore()) +" runs in " +  balls + " balls"+ "\n" + "Required Runrate: " + reqRunrate );

		
	}

}

public class MatchMain {
public static void main(String [] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the match format " + "\n" + "1.ODI"  + "\n" + "2.T20"+ "\n" + "3. Test");
	int n = sc.nextInt();
	System.out.println("Enter the Current score:");
	int a = sc.nextInt();
	System.out.println("Enter the current Over:");
	float b = sc.nextFloat();
	System.out.println("Enter the Target Score:");
	int c = sc.nextInt();
	
	if(n == 1) {
	ODIMatch odi = new ODIMatch(a,b,c);
	int e = odi.calculateBalls();
	float d = odi.calculateRunRate();
	odi.display(d, e);
	}
	
	else if(n == 3) {
		TestMatch tm = new TestMatch(a,b,c);
		int e = tm.calculateBalls();
		float d = tm.calculateRunRate();
		tm.display(d, e);
	}
	else if(n == 2) {
		T20Match t2m = new T20Match(a,b,c);
		int e = t2m.calculateBalls();
		float d = t2m.calculateRunRate();
		t2m.display(d, e);
	}
}
}