import java.util.Scanner;
public class Main02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		int givenN;
		int count;
		int sum;
		
		count = 1;
		sum = 0;
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�.");
		System.out.println("N���� �Է��Ͻʽÿ�.");
		givenN = aScanner.nextInt();
		
		while(givenN >= count){
			sum = sum + count;
			System.out.println("�հ�: " + sum);
			count = count + 1;
		}
	}

}
