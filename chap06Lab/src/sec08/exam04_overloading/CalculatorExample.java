package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		System.out.println("10 정사각형 넓이");
		double result1 = myCalcu.areaRectangle(10);
		System.out.println("정사각형:"+result1);
		
		//직사각형의 넓이
		System.out.println("10, 29 직사각형 넓이");
		double result2 = myCalcu.areaRectangle(10, 29);
		System.out.println("직사각형:"+result2);
		
	}

}
