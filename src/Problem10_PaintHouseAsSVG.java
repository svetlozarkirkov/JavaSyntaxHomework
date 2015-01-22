import java.util.ArrayList;
import java.util.Scanner;

public class Problem10_PaintHouseAsSVG {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nPoints = input.nextInt();
		ArrayList<ArrayList<Double>> points = new ArrayList<ArrayList<Double>>();
		for(int i = 0; i < nPoints; i++){
			ArrayList<Double> temp = new ArrayList<Double>();
			temp.add(input.nextDouble());
			temp.add(input.nextDouble());
			points.add(temp);
		}
	}
}