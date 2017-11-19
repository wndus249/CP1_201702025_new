
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree=1;
		double radian=0;
		double sineValue;
		int numberOfAsterisks;
		
		while(0< degree && degree<180){
			radian = ((double)degree/180.0)*3.141592;
			sineValue = mySine(radian);
			numberOfAsterisks = (int)((sineValue*40.0)+0.5);
			
			if(degree < 10) {
				System.out.print("sine(00"+degree+")µµ: ");
			}
			else if(degree < 100) {
				System.out.print("sine(0"+degree+")µµ: ");
			}
			else {
				System.out.print("sine("+degree+")µµ: ");
			}
			
			printAsterisks(numberOfAsterisks);
			degree = degree+5;
		}
	}

	private static void printAsterisks(int n){
		int i=0;
		while(n>i){
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	
	private static double mySine(double x) {
		double xSquare = x*x;
		double currentTerm = x;
		int n=2;
		double sineValue = currentTerm;
		while(Math.abs(currentTerm) >= 0.000001) {
			currentTerm = -currentTerm*xSquare/(double)(n*(n+1));
			sineValue = sineValue+ currentTerm;
			n = n+2;
		}
		return sineValue;
	}
}