import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numA = input.nextInt();
		float numB = input.nextFloat();
		float numC = input.nextFloat();
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		DecimalFormat threeDigits = new DecimalFormat("0.000");
		System.out.print('|');
		System.out.print(String.format("%-10s", Integer.toHexString(numA).toUpperCase()));
		System.out.print('|');
		System.out.print(String.format("%10s", Integer.toBinaryString(numA)).replace(' ', '0'));
		System.out.print('|');
		System.out.print(String.format("%10s",twoDigits.format(numB)));
		System.out.print('|');
		System.out.print(String.format("%-10s",threeDigits.format(numC)));
		System.out.print('|');
		input.close();
	}
}