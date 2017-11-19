import java.util.Scanner;
public class Main01_01 {
	private static final int MAX_SIZE =100;
	private static Scanner aScanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��ǻ���� �迭�� ������ ���͸� �𵨷� �� ����
		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents=0;
		double average;
		
		score = inputScore();
		while(score>=0) {
			if(score>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else{
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
//��� ���ϱ�		
		average = calAverage(scores, numberOfStudents);
		System.out.println("����� "+average+" �Դϴ�.");
		System.out.println();
		
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int count =0;
		int highAverageCount =0;
		while(count<numberOfStudents) {
			if(scores[count]>=average) {
				System.out.println("["+count+"] "+scores[count]+" (��� �̻��Դϴ�)");
				highAverageCount++;
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (��� �̸��Դϴ�)");
			}
			count++;
		}
//�ְ�����,�������� ���ϱ�
		int maxScore;
		int minScore;
		maxScore = calcMax(scores, numberOfStudents);
		minScore = calcMin(scores, numberOfStudents);

//����ϱ�
		System.out.println("��� �̻��� �л��� ���� "+highAverageCount+"�� �Դϴ�.");
		System.out.println();
		System.out.println("�ְ����� "+maxScore+" �� �Դϴ�.");
		System.out.println("�������� "+minScore+" �� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static int inputScore() {
		int scoreFromScanner;
		aScanner = new Scanner(System.in);
		System.out.print(">������ �Է��ϼ���: ");
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