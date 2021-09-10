package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			//예외 처리 코드, try 내 코드가 정상실행되면 이부분은 작동안함
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}

