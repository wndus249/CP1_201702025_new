import java.util.Scanner;
public class Main01_01 {
	private static final int MAX_SIZE =100;
	private static Scanner aScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//컴퓨터의 배열은 수학의 벡터를 모델로 한 것임
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents=0;
		double average;
		
		score = inputScore();
		while(score>=0) {
			if(score>100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else{
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			score = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
//평균 구하기		
		average = calAverage(scores, numberOfStudents);
		System.out.println("평균은 "+average+" 입니다.");
		System.out.println();
		
		System.out.println("입력된 성적은 다음과 같습니다.");
		int count =0;
		int highAverageCount =0;
		while(count<numberOfStudents) {
			if(scores[count]>=average) {
				System.out.println("["+count+"] "+scores[count]+" (평균 이상입니다)");
				highAverageCount++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (평균 미만입니다)");
			}
			count++;
		}
//최고점수,최저점수 구하기
		int maxScore;
		int minScore;
		maxScore = calcMax(scores, numberOfStudents);
		minScore = calcMin(scores, numberOfStudents);

//출력하기
		System.out.println("평균 이상인 학생의 수는 "+highAverageCount+"명 입니다.");
		System.out.println();
		System.out.println("최고점은 "+maxScore+" 점 입니다.");
		System.out.println("최저점은 "+minScore+" 점 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

	private static int inputScore() {
		int scoreFromScanner;
		aScanner = new Scanner(System.in);
		System.out.print(">성적을 입력하세요: ");
		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}
	
	private static double calAverage(int[] elements, int aSize) {
		int i =0;
		int sum =0;
		double average;
		while(i<aSize) {
			sum = sum + elements[i];
			i++;
		}
		average = (double) sum/ (double)aSize;
		return average;
	}
	private static int calcMax(int[] elements, int aSize) {
		int maxScore = elements[0];
		int i =1;
		while(i<aSize) {
			if(maxScore < elements[i]) {
				maxScore = elements[i];
			}
			i++;
		}
		return maxScore;
	}
	private static int calcMin(int[] elements, int aSize) {
		int minScore = elements[0];
		int i =1;
		while(i<aSize) {
			if(minScore > elements[i]) {
				minScore = elements[i];
			}
			i++;
		}
		return minScore;
	}
}