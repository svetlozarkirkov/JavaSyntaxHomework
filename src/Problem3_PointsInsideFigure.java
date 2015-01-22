import java.util.Scanner;


public class Problem3_PointsInsideFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		if (pointX >= 12.5 && pointX <= 17.5 && pointY <= 13.5 && pointY >= 6){
			System.out.println("Inside");
		}
		else if (pointX >= 12.5 && pointX <= 22.5 && pointY <= 8.5 && pointY >= 6){
			System.out.println("Inside");
		}
		else if (pointX >= 20 && pointX <= 22.5 && pointY <= 13.5 && pointY >= 6){
			System.out.println("Inside");
		}
		else{
			System.out.println("Outside");
		}
		input.close();
	}
}