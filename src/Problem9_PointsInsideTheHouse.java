import java.util.Scanner;


public class Problem9_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		double triangleCx = 12.5;
		double triangleCy = 8.5;
		double triangleAx = 17.5;
		double triangleAy = 3.5;
		double triangleBx = 22.5;
		double triangleBy = 8.5;
		if(isInside(triangleAx,triangleAy,triangleBx,triangleBy,triangleCx,triangleCy,pointX,pointY)){
			System.out.println("Inside");
		}
		else if (pointX >= 12.5 && pointX <= 17.5 && pointY <= 13.5 && pointY >=8.5){
			System.out.println("Inside");
		}
		else if (pointX >= 20 && pointX <= 22.5 && pointY <= 13.5 && pointY >=8.5){
			System.out.println("Inside");
		}
		else{
			System.out.println("Outside");
		}
		input.close();
	}
	static boolean isInside(double x1, double y1, double x2, double y2, double x3, double y3, double x, double y)
	{   
	   double A = area (x1, y1, x2, y2, x3, y3);
	 
	   double A1 = area (x, y, x2, y2, x3, y3);
	 
	   double A2 = area (x1, y1, x, y, x3, y3);
	 
	   double A3 = area (x1, y1, x2, y2, x, y);
	   
	   return (A == A1 + A2 + A3);
	}
	static double area(double x1, double y1, double x2, double y2, double x3, double y3)
	{
	   return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
}
