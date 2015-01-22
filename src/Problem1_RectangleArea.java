import java.util.Scanner;

public class Problem1_RectangleArea {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				int sideA = input.nextInt();
				int sideB = input.nextInt();
				System.out.println(sideA*sideB);
				input.close();
			}
	}