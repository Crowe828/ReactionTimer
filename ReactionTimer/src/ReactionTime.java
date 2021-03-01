import java.util.Scanner;

public class ReactionTime {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("1...");
		Thread.sleep(1000);
		
		System.out.println("Go!");
		System.out.println("Enter text and press enter:");
		long startTime = System.currentTimeMillis();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		long reactionTime = stopTime - startTime;
		
		System.out.println("Reaction time: " + reactionTime + "ms");
		
		
		
	}

}
