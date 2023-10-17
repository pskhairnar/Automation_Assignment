import java.util.Scanner;

public class Tempratureconversion {
	
	public static void main(String[] args) {
		
		Scanner Scan =new Scanner(System.in);
		
		System.out.println("Enter Temprature in celcius:");
		
		double Tempraturecelcius = Scan.nextDouble();
		
		double tempraturfahrenheit = 1.8*Tempraturecelcius+32;
		
		System.out.println("Temprature in Fahrenheit:"+ " " + tempraturfahrenheit);
		
		int kelvin = (int) (Tempraturecelcius+273);
		
		System.out.println("Temprature in Kelvin:"+" "+ kelvin);
		
	}

}
