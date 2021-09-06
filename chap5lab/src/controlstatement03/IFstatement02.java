package controlstatement03;

import java.io.IOException;

/*
 * if문 기본형식2]
 * if(조건식){
 * 조건식이 참이면 실행할 명령문;
 * }
 * else{
 * 조건식이 거짓일때 실행할 명령문;
 * }
 * 역시 실행할 명령문이 하나일때는 {} 생략 가능
 */
/*
 * 삼항연산자
 * if ~else문과 같음
 * 코드를 짧게 표현할때 주로 사용(if else문 대체)
 * 구문]
 * 변수=조건식?참일때:거짓일때;
 */
public class IFstatement02 {

	public static void main(String[] args) throws IOException {
		int num1=91;
		System.out.println("if문 형식 첫번째 짝홀수 판단");
		if(num1%2==0) System.out.println("짝수");
		if(num1%2!=0) System.out.println("홀수");
		
		System.out.println("if문 형식 두번째 짝홀수 판단");
		if(num1%2==0) System.out.println("짝수");
		else System.out.println("홀수");
		
		System.out.println("if문 형식 세번째 짝홀수 판단");
		String result = num1%2==0 ? "짝수" : "홀수";
		System.out.println(result);
		
		System.out.println("[짝/홀수 판단 후 짝수인 경우 100이상인지 판단-ifelse문]");
		if(num1%2==0) {
			if(num1>=100) System.out.println("100이상 짝수");
			else System.out.println("100미만 짝수");
		}
		else {
			if(num1>=100) System.out.println("100이상 홀수");
			else System.out.println("100미만 홀수");
		}
		
		System.out.println("한문자를 입력하세요");
		int ascii = (char)System.in.read();
		if(ascii>='0' && ascii<='9') System.out.println("숫자입니다.");
		else System.out.println("숫자가 아닙니다");

		System.in.skip(2);//맥북인 경우:1
		System.out.println("한문자를 입력하세요2");
		int ascii2 = (char)System.in.read();
		String result2 = (ascii2>='0' && ascii2<='9') ? "숫자입니다.":"숫자가 아닙니다.";
		System.out.println(result2);
		
		

	}

}
