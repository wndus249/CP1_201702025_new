import java.util.Scanner;
public class Main01 {
	private static final int MAX_SIZE =100;
	private static Scanner aScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//컴퓨터의 배열은 수학의 벡터를 모델로 한 것임
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents=0;
		int totalScore =0;
		double averageScore;
		
		score = inputScore();
		while(score>=0) {
			if(score>100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else{
				scores[numberOfStudents] = score;
				numberOfStudents++;
				totalScore = totalScore + score;
			}
			score = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		averageScore = (double)totalScore/(double)numberOfStudents;
		System.out.println("평균은 "+averageScore+" 입니다.");
		System.out.println();
		
		System.out.println("입력된 성적은 다음과 같습니다.");
		int count =0;
		int highAverageCount =0;
		while(count<numberOfStudents) {
			if(scores[count]>=averageScore) {
				System.out.println("["+count+"] "+scores[count]+" (평균 이상입니다)");
				highAverageCount++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (평균 미만입니다)");
			}
			count++;
		}
		System.out.println("평균 이상인 학생의 수는 "+highAverageCount+"명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

	private static int inputScore() {
		int scoreFromScanner;
		aScanner = new Scanner(System.in);
		System.out.print(">성적을 입력하세요: ");
		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}
	
}
