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
		System.out.println("1부터 N까지 합계를 구하려고 합니다.");
		System.out.println("N값을 입력하십시오.");
		givenN = aScanner.nextInt();
		
		while(givenN >= count){
			sum = sum + count;
			System.out.println("합계: " + sum);
			count = count + 1;
		}
	}

}
