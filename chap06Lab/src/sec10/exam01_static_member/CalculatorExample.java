package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 + 10 + Calculator.pi;
		int result2 = Calculator./* 정적변수만 호출 */plus(10, 5);
		int result3 = Calculator./* 정적변수만 호출 */minus(10, 5);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

	}

}
