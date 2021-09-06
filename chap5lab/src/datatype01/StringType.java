package datatype01;
/*
 * String:참조형-기본자료형이 아님
 * 문자열을 저장할 수 있음
 * 자바에서 문자열을 나타낼때는 ""(double quotation) 감싼다.
 * +는 숫자연산에 사용될때는 더하기지만 문자열에는 연결을 의미
 * 문자열+숫자는 문자열
 */
public class StringType {//객체는 시작을 무조건 대문자

	public static void main(String[] args) {
		int number;//변수 선언
		number=99;//변수 초기화
		
		//String strNumber = number;[x]
		//int num1=(int)"100";[x] 참조형과 기본자료형간 형 변환 불가
		
		String strNumber ="100"+99;
		System.out.println(strNumber);
		String strNumber2 ="899"+99;
		System.out.println(number+strNumber2);
		
		//new 연산자를 사용해서 문자열 저장
		String newString = new String("new연산자 사용");
		System.out.println(newString);
		
		String stringLikeBasic="기본자료형처럼 문자열 저장";
		System.out.println(stringLikeBasic);
		
		String plusString;
		plusString = newString + ", "+stringLikeBasic;
		System.out.println(plusString);
		
		int kor=100, eng=80, math=90;
		System.out.println("총점:"+(kor+eng+math));
	}

}
