package sec08.exam01_method_declaration;

public class Calculator {
	//구성멤버
	//1.필드
	//2.생성자
	//3.메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;		
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
