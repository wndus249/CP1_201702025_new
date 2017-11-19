
public class Main01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  a, b, c;
		double  determinant;
		double x1, x2;
		a =  1.0;
		b = 2.0;
		c = 3.0;
		System.out.println("a= "+ a +" b="+ b + " c= "+ c);
		determinant = b*b - 4.0*a*c;
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b + Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is either " + x1 + " or "+ x2);
	}

}
