package operator02;
/*
 * [쉬프트(shift) 연산자(이항연산자)]
 * 두항은 반드시 정수여야 함
 * 정수<<비트수 : 왼쪽으로 비트수만큼 이동, 오른쪽에 남은 비트는 0으로 채움
 * 정수>>비트수 : 오른쪽으로 비트수만큼 이동, 왼쪽에 남은 비트는 부호비트로
 */
public class BitOP {

	public static void main(String[] args) {
		byte num1=45;
		byte num2=25;
		
		int result=num1&num2;
		System.out.println(result);
		
		byte b1=10, bit1=2;
		int result2 = b1 << bit1;
		System.out.println(result2);
		
				
				
		

	}

}
