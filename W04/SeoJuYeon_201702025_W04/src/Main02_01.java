import java.util.Scanner;
public class Main02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		int fact = 1;
		int i = 1;
		int givenN;
		char userAnswer;
		
		System.out.println("N!�� ���Ͻðڽ��ϱ�?");
		System.out.println("����Ϸ��� 'Y'�� �Է��Ͻʽÿ�.");
		userAnswer = aScanner.next().charAt(0);
		
		while(userAnswer == 'Y'){
			System.out.println("N�� ���� �Է��Ͻʽÿ�.");
			givenN = aScanner.nextInt();
		
			if(givenN == 0){
				System.out.println("0!�� ���� 1�Դϴ�.");
			}
			else if(givenN < 0){
				System.out.println("�Է°��� 0���� �۾Ƽ� ����� �� �����ϴ�.");
			}
			else{
				fact = 1;
				i = 1;
				while(givenN >= i){
					fact = fact * i;
					i = i+1;
				}
				System.out.println(givenN + "!�� ���� " + fact + "�Դϴ�.");
			}
			System.out.println("Factorial�� ����ϰڽ��ϱ�?");
			System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
			userAnswer = aScanner.next().charAt(0);
		}
		aScanner.close();
	}

}
