import java.util.Scanner;

public class exe10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("\n Code: ");

		double value = input.nextDouble();
		double percentage = 0;

		if (value >= 0 && value <= 200) {
			percentage = 0;

		} else if (value > 200 && value <= 400) {
			percentage = 0.2;

		} else if (value > 400 && value <= 600) {
			percentage = 0.3;

		} else if (value > 600) {
			percentage = 0.4;

		}
		
		System.out.println(value * percentage);
	}
}
