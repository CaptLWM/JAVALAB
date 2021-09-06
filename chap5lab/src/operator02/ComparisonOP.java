package operator02;
/*
 * 비교연산자(이항연산자)의 결과는
 * true아니면 false(boolean값)
 * >,<,>=,<=,==
 * != : ~와 다르다
 * 비교연산자는 모두 우선순위가 같다.
 * 산술연산자가 비교연산자보다 우선순위가 높다.
 * 비교연산자를 사용한 식은 비교식
 */
public class ComparisonOP {

	public static void main(String[] args) {
		int num1=10, num2=20;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1+30>=num2+10);
		
		System.out.println(10.0 == 10.0f);
		System.out.println(0.2d == 0.2f);//double과 float차이 생각
		System.out.println((float)0.2 == 0.2f);
		
		double d=(double)0.2f;
		System.out.println(d);
		
		boolean b=!true||true^false&&true;
		//         flase true true
		System.out.println("b:"+b);
	}

}
