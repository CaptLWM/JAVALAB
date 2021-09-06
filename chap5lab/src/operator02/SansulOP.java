package operator02;
/*
 * 산술연산자(이항연산자)의 결과는 다양
 * 산술연산자내에서 연산 우선순위
 * (*%/) > (+-)
 * 우선순위가 같을경우 왼쪽에서 오른쪽으로 연산한다
 * 산술연산자를 써서 식을 만들면 산술식
 */
public class SansulOP {

	public static void main(String[] args) {
		int num1=3;
		int num2=5;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println((double)num1/num2);
		
		short s=200;
		//short s2=-s;[x]연산을 하면 정수형이 됨
		
		int num3=-s; 
		System.out.println(num3);
		
		num3=num1+num2; //이항연산
		num3=(num1>num2)? 1:0;
		System.out.println(num3);
		
		/*
		 * 연산 순서
		 * 1. 단항, 이향, 삼항
		 * 2. 산술, 비교 논리, 대입연산자순
		 * 3. 단항, 대입 연산자를 제외한 모든 연산자의 방향은 왼쪽->오른쪽
		 * 복잡한 연산식에는 괄호를 사용해서 우선순위 정해주면됨		 * 
		 */

		int result=3*2+5%-6/3*8;;
		System.out.println(result);
	}

}
