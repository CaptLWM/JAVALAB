package verify.exam17;

public class Printer {
	// 메소드
	public static void Println(int value) {// 1)
		System.out.println(value);
	}

	// 메소드 오버로딩
	public static void Println(boolean value) {// 2)
		System.out.println(value);
	}

	public static void Println(double value) {// 2)
		System.out.println(value);
	}

	public static void Println(String value) {// 2)
		System.out.println(value);
	}
}
