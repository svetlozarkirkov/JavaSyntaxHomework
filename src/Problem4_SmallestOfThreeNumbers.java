import java.util.Scanner;


public class Problem4_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double smallest = Double.MAX_VALUE;
		for(int i = 0; i < 3; i++){
			double tempNum = input.nextDouble();
			if(tempNum < smallest){
				smallest = tempNum;
			}
		}
		if ((smallest == Math.floor(smallest)) && !Double.isInfinite(smallest)){ //Checks if smallest is a whole number
			System.out.println((int)Math.round(smallest));
		}
		else{
			System.out.println("smallest: " + smallest);
		}
		input.close();
	}
}