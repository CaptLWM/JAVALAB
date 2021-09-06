package controlstatement03;

import java.io.IOException;

public class Test0902 {

	public static void main(String[] args) throws IOException{
		System.out.println("1.하나의 문자를 입력하세요.");
		int word=(char)System.in.read();

		boolean isNumber =(word>='0' && word <='9')||
						  (word>='A' && word <='Z')||
						  (word>='a' && word <='z');
		
		if(isNumber) System.out.println("알파벳 혹은 숫자");
		if(!isNumber) System.out.println("기타");
		
		/*
		 * word=(char)System.in.read();
		 * boolean isNumberOrAlphabet = (word>='0' && word <='9')||
		 * 								(word>='A' && word <='Z')||
		 * 								(word>='a' && word <='z');
		 * if(isNumberOrAlphabet) System.out.println("알파벳 혹은 숫자")
		 * if(!isNumberOrAlphabet) System.out.println("기타")
		 */
		
		System.in.skip(2);//맥북인 경우:1
		System.out.println("2.하나의 문자를 입력하세요.");
		word=(char)System.in.read();
		
		boolean Number2 = (word>'0' && word <='9') && ((int)word%2==0);
		if(Number2) System.out.println("2의배수입니다");
		if(!Number2) System.out.println("2의배수가아닙니다");
		
		/*
		 * if(word>='0' && word <='9') {
		 *		if(word%0==0) System.out.println("2의배수입니다.");
		 *		if(word%0!=0) System.out.println("2의배수가 아닙니다.");
		 *}
		 *
		 */

	}

}
