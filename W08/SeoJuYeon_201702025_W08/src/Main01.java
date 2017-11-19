import java.util.Scanner;
public class Main01 {
	private static final int MAX_SIZE =100;
	private static Scanner aScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��ǻ���� �迭�� ������ ���͸� �𵨷� �� ����
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents=0;
		int totalScore =0;
		double averageScore;
		
		score = inputScore();
		while(score>=0) {
			if(score>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else{
				scores[numberOfStudents] = score;
				numberOfStudents++;
				totalScore = totalScore + score;
			}
			score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		averageScore = (double)totalScore/(double)numberOfStudents;
		System.out.println("����� "+averageScore+" �Դϴ�.");
		System.out.println();
		
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int count =0;
		int highAverageCount =0;
		while(count<numberOfStudents) {
			if(scores[count]>=averageScore) {
				System.out.println("["+count+"] "+scores[count]+" (��� �̻��Դϴ�)");
				highAverageCount++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (��� �̸��Դϴ�)");
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+highAverageCount+"�� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static int inputScore() {
		int scoreFromScanner;
		aScanner = new Scanner(System.in);
		System.out.print(">������ �Է��ϼ���: ");
		scoreFromScanner = aScanner.nextInt();
		return scoreFromScanner;
	}
	
}
