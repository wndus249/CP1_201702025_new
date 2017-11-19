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
		
		System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�");
		score_Korean = inputScore();
		student.setScoreKorean(score_Korean);
		score_English = inputScore();
		student.setScoreEnglish(score_English);
		score_Computer = inputScore();
		student.setScoreComputer(score_Computer);
		
		while((score_Korean>=0)&&(score_English>=0)&&(score_Computer>=0)) {
			if((score_Korean>100)||(score_English>100)||(score_Computer>100)) {
				System.out.println("����: 100�� �Ѿ �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else {
				System.out.println("[��   ��] ����: "+student.scoreKorean()+", ����: "+student.gradeKorean()+", ����: "+ student.gradePointKorean());
				System.out.println("[��   ��] ����: "+student.scoreEnglish()+", ����: "+student.gradeEnglish()+", ����: "+ student.gradePointEnglish());
				System.out.println("[��ǻ��] ����: "+student.scoreComputer()+", ����: "+student.gradeComputer()+", ����: "+ student.gradePointComputer());
				System.out.println("�� �л��� ��������� "+student.gpa()+" �Դϴ�.");
				gpaCounter.count(student.gpa());
			}
			System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�.");
			score_Korean = inputScore();
			student.setScoreKorean(score_Korean);
			score_English = inputScore();
			student.setScoreEnglish(score_English);
			score_Computer = inputScore();
			student.setScoreComputer(score_Computer);
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0 �̻��� �л��� "+gpaCounter.numberOfGPA3()+"�� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+gpaCounter.numberOfGPA2()+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+gpaCounter.numberOfGPA1()+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+gpaCounter.numberOfGPA0()+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static int inputScore() {
		System.out.print("-������ �Է��Ͻÿ�: ");
		return aScanner.nextInt();
	}
}