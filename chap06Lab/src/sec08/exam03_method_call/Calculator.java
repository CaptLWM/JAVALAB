package sec08.exam03_method_call;

public class Calculator {
	// 메소드(method)

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // 자동형변환
		double result = sum / 2;
		return result;
	}

	void excute() {
		double result = avg(7, 10);
		println("실행결과: "+result);
	}

	void println(String message) {
		System.out.println(message);
	}
}
