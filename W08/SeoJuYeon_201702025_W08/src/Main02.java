import java.util.Scanner;
public class Main02 {
	private static final int MAX_SIZE =100;
	private static Scanner aScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score_Korean, score_Computer;
		int[] scores_Korean = new int [MAX_SIZE];
		int[] scores_Computer = new int [MAX_SIZE];
		double[] student_Average = new double [MAX_SIZE];
		int numberOfStudents=0;
		double totalStudent_AverageScore =0;
		double classAverage=0;
		
		System.out.println(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오.");
		score_Korean = inputScore();
		score_Computer = inputScore();
		
		while((score_Korean>= 0)&&(score_Computer>= 0)) {
			if((score_Korean >100)||(score_Computer >100)) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scores_Korean[numberOfStudents] = score_Korean;
				scores_Computer[numberOfStudents] = score_Computer;
				student_Average[numberOfStudents] = (double)(score_Korean+score_Computer)/2.0;
				totalStudent_AverageScore = totalStudent_AverageScore + student_Average[numberOfStudents];
				numberOfStudents++;
			}
			System.out.println(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오 ");
			score_Korean = inputScore();
			score_Computer = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		System.out.println();
		
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		classAverage = totalStudent_AverageScore/(double)numberOfStudents;
		int count =0;
		int highAverage =0;
		while(count < numberOfStudents) {
			if(student_Average[count] >= classAverage) {
				System.out.println("["+count+"] "+scores_Korean[count]+" "+scores_Computer[count]+" (평균 "+student_Average[count]+")");
				highAverage++;
			}
			else {
				System.out.println("["+count+"] "+scores_Korean[count]+" "+scores_Computer[count]+" (평균 "+student_Average[count]+")");
			}
			count++;
		}
		System.out.println();
		System.out.println("학급 평균은 "+classAverage+"입니다.");
		System.out.println("평균 이상인 학생의 수는 "+highAverage+"명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
			
	}
	
	private static int inputScore() {
		aScanner = new Scanner(System.in);
		int aScore;
		aScore = aScanner.nextInt();
		return aScore;
	}

}

