import java.util.Scanner;

public class Main01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		System.out.println("a�� ���� �Է��Ͻÿ�.");
		a = aScanner.nextDouble();
		System.out.println("b�� ���� �Է��Ͻÿ�.");
		b = aScanner.nextDouble();
		System.out.println("c�� ���� �Է��Ͻÿ�.");
		c = aScanner.nextDouble();
		
		determinant = b*b - 4.0*a*c;
		
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b + Math.sqrt(determinant))/(2.0*a);
		
		if(determinant < 0){
			System.out.println("����: �Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
		}
		else{
			System.out.println("�Ǳ���  " + x1 + " �Ǵ� "+ x2 + "�Դϴ�.");
	
		}
	}

}
