package controlstatement03;

import java.io.IOException;

/*
	 * if- 범위를 가지는 값
	 * 분기문(조건문):프로그램 흐름상 분기하고자 할때 사용하는 제어문
	 * if문/switch문 두가지 있음.
	 * 
	 * if문 기본 형식1]
	 * 조건식은 비교식 내지 논리식이어야 한다.
	 * 즉 결과값이 1 아니면 0이 나오는식이거나
	 * 직접 boolean(1,0)을 줄 수 있다.
	 * 
	 * if(조건식){//만약(if) 조건식이 참이라면(조건식, 비교문)
	 * 		조건식이 참일때 실행할 명령문;
	 * }
	 * 
	 * 조건식이 참일때 실행할 명령문이 하나이면
	 * {}는 생략 가능, 실행문을 하나로 묶는 역할이기 때문에
	 * 
	 * 2]if(조건식);는 조건식이 참일때 실행할 명령문이 없음을 의미(주의할것)
	 * 3]조건식이 참일때 수행할 명령문이 하나인 경우 {}는 생략가능
	 */
public class IFstatement{

	public static void main(String[] args) throws IOException {
		
		int num1=10;
		//if(num1%2) {};[x] 참 거짓으로 못나눔
		if(num1%2==0) {
			System.out.printf("%d는 짝수\n", num1);
		}
		
		num1=11;
		if(num1%2!=0) {
			System.out.printf("%d는 홀수\n", num1);
		}
		
		if(num1%2!=0 && num1>10) {
			System.out.printf("%d는 홀수이고 10보다 큰 수 입니다.\n",num1);		}
		
		if(true) System.out.println("항상 실행되는 명령문");
		if(false) System.out.println("절대 실행 안됨");
		
		num1=10;
		if(num1%2!=0) ;{
			System.out.printf("%d는 홀수\n",num1);
		}
		
		if(num1%2==0) System.out.printf("%d는 짝수\n", num1);
		
		num1=9;
		if(num1%2!=0) {
			System.out.printf("num1은 %d\n", num1);
			System.out.printf("%d는 홀수이다\n", num1);
		}
		
		System.out.println("1. 한문자를 입력하세요.");
		int asciiCode=System.in.read();
		System.out.println("사용자가 입력한 문자의 아스키 코드값:"+asciiCode);
		System.out.println("사용자가 입력한 문자의 아스키 코드값:"+(char)asciiCode);
		//사용자가 입력한 문자가 숫자인지 문자인지 판단하자
		boolean isNumber = asciiCode>=48 && asciiCode<=57;
		if(isNumber) System.out.println("입력한 문자는 숫자입니다.");
		if(!isNumber) System.out.println("입력한 문자는 숫자가아닙니다.");
		
		System.out.println("2. 하나의 문자를 입력하세요");
		char word=(char)System.in.read();
		System.out.println("입력한 문자:"+(int)word);//\r(13)
		word=(char)System.in.read();
		System.out.println("입력한 문자2:"+(int)word);//\n(10)
		
		System.in.skip(2);//맥북인 경우:1
		System.out.println("3.하나의 문자를 입력하세요.");
		word=(char)System.in.read();
	}

}
