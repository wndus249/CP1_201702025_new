
public class Main02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("<<Sine �� ��� ���α׷��� �����մϴ�>>");
		
		int n = 0;
		int givenNumber = 180;
		double angleX;
		double angleY;
		
		
		while( n < givenNumber){
			n = n + 1;
			angleX = (double)n*(3.141592/180.0);
			angleY = Math.sin(angleX);
			System.out.println("Sine("+ n + "��)�� "+ angleY +"�Դϴ�.");
		}
		
	}

}
