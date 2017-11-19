import java.util.Scanner;
public class Main01_01 {	
	private static Scanner aScanner;
	static int numberOfGradeA=0;
	static int numberOfGradeB=0;
	static int numberOfGradeC=0;
	static int numberOfGradeD=0;
	static int numberOfGradeF=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int currentScore;
		char grade;
		double point;

		System.out.print("점수를 입력하시오: ");
		currentScore = inputScore();
		
		while(currentScore>=0) {
			if(currentScore>100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				grade = score2Grade(currentScore);
				point = grade2Point(grade);
				System.out.println("점수: "+currentScore+",  학점: "+grade+",  평점: "+point);
			}
			System.out.print("점수를 입력하시오: ");
			currentScore = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("A는 "+numberOfGradeA+"명 입니다.");
		System.out.println("B는 "+numberOfGradeB+"명 입니다.");
		System.out.println("C는 "+numberOfGradeC+"명 입니다.");
		System.out.println("D는 "+numberOfGradeD+"명 입니다.");
		System.out.println("F는 "+numberOfGradeF+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
		
	}

	
	private static int inputScore(){
		int score;
		aScanner = new Scanner(System.in);
		score = aScanner.nextInt();
		return score;
	}
	
	private static char score2Grade(int aScore) {
		char grade;
		if((aScore>=90)&&(aScore<=100)) {
			grade ='A';
			numberOfGradeA++;
		}
		else if((aScore>=80)&&(aScore<90)) {
			grade ='B';
			numberOfGradeB++;
		}
		else if((aScore>=70)&&(aScore<80)) {
			grade ='C';
			numberOfGradeC++;
		}
		else if((aScore>=60)&&(aScore<70)) {
			grade ='D';
			numberOfGradeD++;
		}
		else {
			grade ='F';
			numberOfGradeF++;
		}
		return grade;
	}
	
	private static double grade2Point(char aGrade) {
		double point;
		if(aGrade=='A') {
			point = 4.0;
		}
		else if(aGrade=='B') {
			point = 3.0;
		}
		else if(aGrade=='C') {
			point = 2.0;
		}
		else if(aGrade=='D') {
			point = 1.0;
		}
		else {
			point =0.0;
		}
		return point;
	}
}
