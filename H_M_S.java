import java.util.Scanner;

public class H_M_S {
	
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter number of sec");
		
		int Sec = scan.nextInt();
		
		int hours = Sec/3600;
		
		int min = (Sec % 3600)/60;
		
		int Seconds = (min%60);
		
		System.out.println("your conversion of hours min and sec is" + "  " + hours + "hours" +":"+ min +"minutes" + ":"+ Seconds+ "seconds");

		
	}

}
