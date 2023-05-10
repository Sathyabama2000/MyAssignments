package week2.day4;



public class Calculator {

		public void addionTwoNumber(int a , int b) {
			int c = a + b;
			System.out.println(c);
			}
		public void subractionTwoNumber(int e , int f) {
			int c = e - f;
			System.out.println(c);
			}
		public void multipleTwoNumber(double i , double j) {
			double c =i * j;
			System.out.println(c);
			}
		public void divideTwoNumber(float x , float y) {
			float c = x / y;
			System.out.println(c);
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Calculator cal = new Calculator();
	     cal.addionTwoNumber(100, 200);
	     cal.subractionTwoNumber(50, 20);
	     cal.multipleTwoNumber(122,179);
	     cal.divideTwoNumber(60.0f, 12.0f);
	}

}

