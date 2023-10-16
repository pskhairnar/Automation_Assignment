import java.util.Scanner;

public class squarecube {
	
	public static void main(String[] args) {
		
		Scanner Scan =new Scanner(System.in);
		
		System.out.println("Enter the number to convert it into square cube and forth power");	
		
		int number = Scan.nextInt();
		
		int square = number * number;
		
		System.out.println("Square of number you have entered" + " "+square);
		
		int cube = square*number;
		
		System.out.println("Cube of number you have entered" + " "+ cube);
		
		int forthpower = cube*number;
		
		System.out.println("forth power of number you have entered" + " " + forthpower);
		
		
	}

}
