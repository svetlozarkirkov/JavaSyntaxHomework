import java.util.Scanner;


public class Problem7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String binary = String.format("%16s",Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(binary);
		int count = 0;
		for (int i = 0; i < binary.length();i++){
			if (binary.charAt(i)=='1'){
				count++;
			}
		}
		System.out.println("count: "+count);
		input.close();
	}
}
