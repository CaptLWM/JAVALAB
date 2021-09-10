package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100"; //숫자형태의 문자열
		String data2 = "a100";

		//Integer.parseInt()는 매개변수의 문자열을 정수로 변환해준다.
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);//NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

