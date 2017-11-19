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

		System.out.print("������ �Է��Ͻÿ�: ");
		currentScore = inputScore();
		
		while(currentScore>=0) {
			if(currentScore>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				grade = score2Grade(currentScore);
				point = grade2Point(grade);
				System.out.println("����: "+currentScore+",  ����: "+grade+",  ����: "+point);
			}
			System.out.print("������ �Է��Ͻÿ�: ");
			currentScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("A�� "+numberOfGradeA+"�� �Դϴ�.");
		System.out.println("B�� "+numberOfGradeB+"�� �Դϴ�.");
		System.out.println("C�� "+numberOfGradeC+"�� �Դϴ�.");
		System.out.println("D�� "+numberOfGradeD+"�� �Դϴ�.");
		System.out.println("F�� "+numberOfGradeF+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
		
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
