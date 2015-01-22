import java.util.Scanner;


public class Problem8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		int count = 0;
		for (int i = 0; i < binary.length()-1;i++){
			if (binary.charAt(i)==binary.charAt(i+1)){
				count++;
			}
		}
		System.out.println("count: "+count);
		input.close();
	}
}
