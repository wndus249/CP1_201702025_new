import java.util.Scanner;
public class Main01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		int score;
		
		int numberOfStudents = 0;
		int sumOfScores = 0;
		double average;
		char grade;
		int numberOfGradeA = 0;
		int numberOfGradeB = 0;
		int numberOfGradeC = 0;
		int numberOfGradeD = 0;
		int numberOfGradeF = 0;

		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.println("");
		System.out.print("������ �Է��ϼ���: ");
		score = aScanner.nextInt();
		
		while(score >= 0){
			if(score > 100){
				System.out.println("����: �ִ����� 100�� �Ѿ����ϴ�.");
			}
			else{
				if(score >= 90 && score<= 100){
					grade = 'A';
					numberOfGradeA = numberOfGradeA + 1;
				}
				else if(score >= 80 && score <= 89){
					grade = 'B';
					numberOfGradeB = numberOfGradeB + 1;
				}
				else if(score >= 70 && score <= 79){
					grade = 'C';
					numberOfGradeC = numberOfGradeC + 1;
				}
				else if(score >= 60 && score <= 69){
					grade = 'D';
					numberOfGradeD = numberOfGradeD + 1;
				}
				else{
					grade = 'F';
					numberOfGradeF = numberOfGradeF + 1;
				}
				System.out.println("  (����: "+ score + ", ����: "+ grade+")");
				numberOfStudents = numberOfStudents + 1;
				sumOfScores = sumOfScores + score;
			}
			System.out.print("������ �Է��ϼ���: ");
			score = aScanner.nextInt();
		}
		aScanner.close();
		
		average = (double)sumOfScores / (double)numberOfStudents;
		System.out.println("");
		System.out.println("�л� ���� "+ numberOfStudents + "�� �Դϴ�.");
		System.out.println("A�� "+ numberOfGradeA+ "�� �Դϴ�.");
		System.out.println("B�� "+ numberOfGradeB+ "�� �Դϴ�.");
		System.out.println("C�� "+ numberOfGradeC+ "�� �Դϴ�.");
		System.out.println("D�� "+ numberOfGradeD+ "�� �Դϴ�.");
		System.out.println("F�� "+ numberOfGradeF+ "�� �Դϴ�.");
		System.out.println("����� "+ average+ "�Դϴ�.");
		System.out.println("");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
	}

}
