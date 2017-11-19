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

		System.out.println("<<성적 처리 프로그램을 시작합니다>>");
		System.out.println("");
		System.out.print("성적을 입력하세요: ");
		score = aScanner.nextInt();
		
		while(score >= 0){
			if(score > 100){
				System.out.println("오류: 최대점수 100을 넘었습니다.");
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
				System.out.println("  (성적: "+ score + ", 학점: "+ grade+")");
				numberOfStudents = numberOfStudents + 1;
				sumOfScores = sumOfScores + score;
			}
			System.out.print("성적을 입력하세요: ");
			score = aScanner.nextInt();
		}
		aScanner.close();
		
		average = (double)sumOfScores / (double)numberOfStudents;
		System.out.println("");
		System.out.println("학생 수는 "+ numberOfStudents + "명 입니다.");
		System.out.println("A는 "+ numberOfGradeA+ "명 입니다.");
		System.out.println("B는 "+ numberOfGradeB+ "명 입니다.");
		System.out.println("C는 "+ numberOfGradeC+ "명 입니다.");
		System.out.println("D는 "+ numberOfGradeD+ "명 입니다.");
		System.out.println("F는 "+ numberOfGradeF+ "명 입니다.");
		System.out.println("평균은 "+ average+ "입니다.");
		System.out.println("");
		System.out.println("<<성적 처리 프로그램을 종료합니다>>");
	}

}
