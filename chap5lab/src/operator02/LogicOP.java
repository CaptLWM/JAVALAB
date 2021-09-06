package operator02;
/*
 * && : 논리합
 *   - false&&false : false
 *   - True&&false : false
 *   - false&&True : false
 *   - True&&True : True
 * || : 논리곱
 *   - false||false : false
 *   - True||false : True
 *   - false||True : True
 *   - True||True : True
 * ! : 부정
 *   - !false : True
 *   - !True : false
 * &,| : 비트연산자(AND, OR)
 * 
 * 비교연산이 논리연산보다 우선순위가 높다.
 * 연산 우선순위 : 산술>비교>논리
 */
public class LogicOP {

	public static void main(String[] args) {
		boolean b1 = (5>3) && (2>3);
		System.out.println(b1);

		boolean b2 = (5>3) || (2>3);
		System.out.println(b2);
		
		//단락회로 평가
		//A&&B : A가 false면 B를 수행안하고 false 리턴
		//A&B : A,B 모두 수행하고 결과를 리턴
		int num1, num2;
		num1=10;
		int i=2;
		//boolean b4=((num1=num1+10)<10) && ((i=i+2)<10);
		boolean b4=((num1=num1+10)<10) & ((i=i+2)<10); 
		System.out.println(b4);
		System.out.println(num1);
		System.out.println(i);
	}

}
