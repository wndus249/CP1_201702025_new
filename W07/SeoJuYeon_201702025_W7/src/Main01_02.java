import java.util.Scanner;
public class Main01_02 {	
	private static Scanner aScanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score_Korean, score_English, score_Computer;
		char grade_Korean, grade_English, grade_Computer;
		double point_Korean, point_English, point_Computer;
		double gpa;
		int count0 =0;
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		
		System.out.println(">세 과목(국어, 영어, 컴퓨터)의 점수를 차레로 입력합니다.");
		System.out.print("국어 점수를 입력하시오: ");
		score_Korean = inputScore();
		System.out.print("영어 점수를 입력하시오: ");
		score_English = inputScore();
		System.out.print("컴퓨터 점수를 입력하시오: ");
		score_Computer = inputScore();
		
		while((score_Korean>0)&&(score_English>0)&&(score_Computer>0)) {
			if((score_Korean>100)||(score_English)>100||(score_Computer>100)) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}
			else {
				grade_Korean = score2Grade(score_Korean);
				grade_English = score2Grade(score_English);
				grade_Computer = score2Grade(score_Computer);
				
				point_Korean = grade2Point(grade_Korean);
				point_English = grade2Point(grade_English);
				point_Computer = grade2Point(grade_Computer);
				
				gpa = calcGPA(point_Korean, point_English, point_Computer);
				
				System.out.println("[국   어] 점수: "+score_Korean+",  학점: "+grade_Korean+",  평점: "+point_Korean);
				System.out.println("[영   어] 점수: "+score_English+",  학점: "+grade_English+",  평점: "+point_English);
				System.out.println("[컴퓨터] 점수: "+score_Computer+",  학점: "+grade_Computer+",  평점: "+point_Computer);
				System.out.println("이 학생의 평균평점은 "+gpa+"입니다.");
				
				if(gpa>= 4.0) {
					count4++;
				}
				else if((gpa>=3.0)&&(gpa<4.0)) {
					count3++;
				}
				else if((gpa>=2.0)&&(gpa<3.0)) {
					count2++;
				}
				else if((gpa>=1.0)&&(gpa<2.0)) {
					count1++;
				}
				else {
					count0++;
				}
				
			}
			System.out.println(">세 과목(국어, 영어, 컴퓨터)의 점수를 차레로 입력합니다.");
			System.out.print("국어 점수를 입력하시오: ");
			score_Korean = inputScore();
			System.out.print("영어 점수를 입력하시오: ");
			score_English = inputScore();
			System.out.print("컴퓨터 점수를 입력하시오: ");
			score_Computer = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 4.0 이상인 학생은 "+count4+"명입니다.");
		System.out.println("평균평점이 3.0이상 4.0미만인 학생은"+count3+"명입니다.");
		System.out.println("평균평점이 2.0이상 3.0미만인 학생은"+count2+"명입니다.");
		System.out.println("평균평점이 1.0이상 2.0미만인 학생은"+count1+"명입니다.");
		System.out.println("평균평점이 1.0미만인 학생은"+count0+"명입니다.");

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
		}
		else if((aScore>=80)&&(aScore<90)) {
			grade ='B';
		}
		else if((aScore>=70)&&(aScore<80)) {
			grade ='C';
		}
		else if((aScore>=60)&&(aScore<70)) {
			grade ='D';
		}
		else {
			grade ='F';
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
	
	private static double calcGPA(double point_Korean, double point_English, double point_Computer) {
		double gpa = (point_Korean+ point_English +point_Computer)/3.0;
		return gpa;
	}
}
