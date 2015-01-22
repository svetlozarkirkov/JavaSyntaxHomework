import java.util.Scanner;


public class Problem5_DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decNum = input.nextInt();
		String hexNum = Integer.toHexString(decNum);
		System.out.println("Hex: " + hexNum.toUpperCase());
		input.close();
	}

}
