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
		
		System.out.println(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�.");
		score_Korean = inputScore();
		score_Computer = inputScore();
		
		while((score_Korean>= 0)&&(score_Computer>= 0)) {
			if((score_Korean >100)||(score_Computer >100)) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores_Korean[numberOfStudents] = score_Korean;
				scores_Computer[numberOfStudents] = score_Computer;
				student_Average[numberOfStudents] = (double)(score_Korean+score_Computer)/2.0;
				totalStudent_AverageScore = totalStudent_AverageScore + student_Average[numberOfStudents];
				numberOfStudents++;
			}
			System.out.println(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� ");
			score_Korean = inputScore();
			score_Computer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		classAverage = totalStudent_AverageScore/(double)numberOfStudents;
		int count =0;
		int highAverage =0;
		while(count < numberOfStudents) {
			if(student_Average[count] >= classAverage) {
				System.out.println("["+count+"] "+scores_Korean[count]+" "+scores_Computer[count]+" (��� "+student_Average[count]+")");
				highAverage++;
			}
			else {
				System.out.println("["+count+"] "+scores_Korean[count]+" "+scores_Computer[count]+" (��� "+student_Average[count]+")");
			}
			count++;
		}
		System.out.println();
		System.out.println("�б� ����� "+classAverage+"�Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� "+highAverage+"�� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
			
	}
	
	private static int inputScore() {
		aScanner = new Scanner(System.in);
		int aScore;
		aScore = aScanner.nextInt();
		return aScore;
	}

}

