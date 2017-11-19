import java.util.Scanner;

public class Main01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		char userAnswer;
		
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.println("풀기를 원하면 'Y'를 입력하십시오.");
		userAnswer = aScanner.next().charAt(0);
		
		while(userAnswer == 'Y'){
			System.out.println("a의 값을 입력하시오.");
			a = aScanner.nextDouble();
			System.out.println("b의 값을 입력하시오.");
			b = aScanner.nextDouble();
			System.out.println("c의 값을 입력하시오.");
			c = aScanner.nextDouble();
		
			determinant = b*b - 4.0*a*c;
		
			x1 = (-b + Math.sqrt(determinant))/(2.0*a);
			x2 = (-b + Math.sqrt(determinant))/(2.0*a);
		
			if((-0.0000001<a) && (a<0.0000001)){
				System.out.println("오류 : 이차항의 계수가 0이므로 이차방정식을 풀 수 없습니다.");
				userAnswer = 'N';
				System.out.println("프로그램을 종료합니다.");
			}
			else if(determinant < 0){
				System.out.println("오류: 판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
			}
			else{
				System.out.println("실근은  " + x1 + " 또는 "+ x2 + "입니다.");
			}
			System.out.println("이차방정식을 풀겠습니까?");
			System.out.println("풀기를 원하면 'Y'를 입력하십시오.");
			userAnswer = aScanner.next().charAt(0);
		
		}
		aScanner.close();
	}

}
