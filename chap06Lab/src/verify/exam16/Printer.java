package verify.exam16;

public class Printer {
	//메소드
	void println(int value){//1)
		System.out.println(value);
	}
	//메소드 오버로딩
	void println(boolean value){//2)
		System.out.println(value);
	}
	
	void println(double value){//2)
		System.out.println(value);
	}
	
	void println(String value){//2)
		System.out.println(value);
	}
}
