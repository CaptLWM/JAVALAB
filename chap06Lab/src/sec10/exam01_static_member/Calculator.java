package sec10.exam01_static_member;

//정적변수
public class Calculator {
	// double pi = 3.14159; 인스턴트 필드 heap영역에 생성
	static double pi = 3.14159;// 정적 필드 method영역에 생성

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
