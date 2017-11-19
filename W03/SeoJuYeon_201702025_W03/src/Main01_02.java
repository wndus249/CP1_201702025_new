import java.util.Scanner;

public class Main01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		System.out.println("a의 값을 입력하시오.");
		a = aScanner.nextDouble();
		System.out.println("b의 값을 입력하시오.");
		b = aScanner.nextDouble();
		System.out.println("c의 값을 입력하시오.");
		c = aScanner.nextDouble();
		
		determinant = b*b - 4.0*a*c;
		
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b + Math.sqrt(determinant))/(2.0*a);
		
		if(determinant < 0){
			System.out.println("오류: 판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
		}
		else{
			System.out.println("실근은  " + x1 + " 또는 "+ x2 + "입니다.");
	
		}
	}

}
