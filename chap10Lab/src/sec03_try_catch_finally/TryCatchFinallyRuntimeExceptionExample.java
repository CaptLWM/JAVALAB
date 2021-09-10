package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample  num1  num2");
			return;//종료를 위한 return
		} 
		
		try { 
			int value1 = Integer.parseInt(data1);//"10"
			int value2 = Integer.parseInt(data2);//"20a"=>오류발생=>catch->finally
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

