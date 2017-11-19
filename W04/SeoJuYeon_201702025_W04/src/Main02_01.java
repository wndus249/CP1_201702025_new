import java.util.Scanner;
public class Main02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		int fact = 1;
		int i = 1;
		int givenN;
		char userAnswer;
		
		System.out.println("N!을 구하시겠습니까?");
		System.out.println("계산하려면 'Y'를 입력하십시오.");
		userAnswer = aScanner.next().charAt(0);
		
		while(userAnswer == 'Y'){
			System.out.println("N의 값을 입력하십시오.");
			givenN = aScanner.nextInt();
		
			if(givenN == 0){
				System.out.println("0!의 값은 1입니다.");
			}
			else if(givenN < 0){
				System.out.println("입력값이 0보다 작아서 계산할 수 없습니다.");
			}
			else{
				fact = 1;
				i = 1;
				while(givenN >= i){
					fact = fact * i;
					i = i+1;
				}
				System.out.println(givenN + "!의 값은 " + fact + "입니다.");
			}
			System.out.println("Factorial을 계산하겠습니까?");
			System.out.println("계산하려면 'Y'를 치십시오.");
			userAnswer = aScanner.next().charAt(0);
		}
		aScanner.close();
	}

}
