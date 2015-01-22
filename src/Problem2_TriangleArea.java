import java.util.Scanner;

public class Problem2_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointAx = input.nextDouble();
		double pointAy = input.nextDouble();
		double pointBx = input.nextDouble();
		double pointBy = input.nextDouble();
		double pointCx = input.nextDouble();
		double pointCy = input.nextDouble();
		double triangleArea = ((pointAx*(pointBy-pointCy))+(pointBx*(pointCy-pointAy))+(pointCx*(pointAy-pointBy)))/2;
		System.out.println((int)Math.round(Math.abs(triangleArea)));
		input.close();
	}
}