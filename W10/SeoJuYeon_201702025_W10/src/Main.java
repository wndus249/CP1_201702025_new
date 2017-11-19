import java.util.Scanner;
public class Main {
	public static Scanner aScanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		GPACounter gpaCounter = new GPACounter();
		int score_Korean;
		int score_English;
		int score_Computer;
		
		System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오");
		score_Korean = inputScore();
		student.setScoreKorean(score_Korean);
		score_English = inputScore();
		student.setScoreEnglish(score_English);
		score_Computer = inputScore();
		student.setScoreComputer(score_Computer);
		
		while((score_Korean>=0)&&(score_English>=0)&&(score_Computer>=0)) {
			if((score_Korean>100)||(score_English>100)||(score_Computer>100)) {
				System.out.println("오류: 100이 넘어서 정상적인 점수가 아닌 것이 있습니다.");
			}
			else {
				System.out.println("[국   어] 점수: "+student.scoreKorean()+", 학점: "+student.gradeKorean()+", 평점: "+ student.gradePointKorean());
				System.out.println("[영   어] 점수: "+student.scoreEnglish()+", 학점: "+student.gradeEnglish()+", 평점: "+ student.gradePointEnglish());
				System.out.println("[컴퓨터] 점수: "+student.scoreComputer()+", 학점: "+student.gradeComputer()+", 평점: "+ student.gradePointComputer());
				System.out.println("이 학생의 평균평점은 "+student.gpa()+" 입니다.");
				gpaCounter.count(student.gpa());
			}
			System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다.");
			score_Korean = inputScore();
			student.setScoreKorean(score_Korean);
			score_English = inputScore();
			student.setScoreEnglish(score_English);
			score_Computer = inputScore();
			student.setScoreComputer(score_Computer);
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0 이상인 학생은 "+gpaCounter.numberOfGPA3()+"명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+gpaCounter.numberOfGPA2()+"명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+gpaCounter.numberOfGPA1()+"명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+gpaCounter.numberOfGPA0()+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

	private static int inputScore() {
		System.out.print("-점수를 입력하시오: ");
		return aScanner.nextInt();
	}
}