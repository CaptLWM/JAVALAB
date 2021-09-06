package controlstatement03;
/*
 * if문 기본형식3]
 * if(조건식1) {
 * 조건식 1이 참일때 실행할 명령문1
 * }
 * else if(조건식2) {
 * 조건식 2이 참일때 실행할 명령문2
 * }
 * .......
 * else if(조건식n)  {
 * 조건식 n이 참일때 실행할 명령문n
 * else {
 * 모든 조건식이 거짓일때 실행할 명령문
 * } 
 */
import java.io.IOException;

public class IFstatement03 {

	public static void main(String[] args)  throws IOException{
		System.out.println("한문자를 입력하세요");
		char word =(char)System.in.read();
		
		if(word>='0' && word<='9') {
			if(word%2==0) System.out.println("2의배수");
			else System.out.println("2의 배수가 아님");
		}
		else if(word>='a' && word<='z') System.out.println("소문자");
		else if(word>='A' && word<='Z') System.out.println("대문자");
		else System.out.println("숫자도 영어도 아닙니다");
		
		System.in.skip(2);
		System.out.println("2.한문자를 입력하세요");
		word =(char)System.in.read();
		
		if(word>='0' && word<='9') System.out.println("숫자");
		else if((word>='a' && word<='z')||(word>='A' && word<='Z')) System.out.println("알파벳");
		else System.out.println("기타");

	}

}
