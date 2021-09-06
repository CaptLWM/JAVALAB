package operator02;
/*
 * [할당(대입)연산자]
 * =: 변수=값
 * 오른쪽에 있는 값을 왼쪽의 변수에 할당(대입)한다.
 * [복합대입연산자(축약표현)]
 * +=, -=, *=, %= 등등
 * 변수 +=값(변수2) => 변수1 = 변수1+값 혹은 변수 1 = 변수1+변수2
 * [증감연산자(단항연산자)]
 * ++는 자기자신을 1 증가
 * --는 자기자신을 1 감소
 */
public class HaldangOP {

	public static void main(String[] args) {
		// 1]할당[대입]연산자
		int num1; //변수 선언
		
		//int num2=num1+1;//[x] 초기화 안했기 때문
		//오른쪽 식이 항상 먼저 실행된 후에
		//결과값을 왼쪽의 변수에 대입
		
		num1=100;
		
		int num2=num1;//변수 num1에 저장된 값 대입
		// 2]복합대입연산자(축약표현)]
		num1 += 200; // num1=num1+200;
		System.out.println(num1);
		
		num1 -= 100;
		System.out.println(num1);
		
		num1 *=2;
		System.out.println(num1);
		
		num1 %=100;
		System.out.println(num1);
		
		//num1 &&=100; [x]복합연산자는 산술연산자만 적용됨
		boolean b1=true, b2=true;
		System.out.println(b1&&b2);
		
		// 단독사용시
		int num3=10;
		num3++;//후위 연산자 : 항의 뒤에 붙는 경우
		System.out.println(num3);
		++num3;//전위 연산자 : 항의 앞에 붙는 경우
		System.out.println(num3);
		
		//다른연산과 함께 사용시
		int num4=20;
		int result = num4+num3++;//후위 연산자는 연산 후 자신을 증가
		System.out.println(result);
		System.out.println(num3);
		
		//전위연산 : 자신을 1증가(감소)한 후에 연산을 수행
		//후위연산 : 연산 대입한 후 자신을 증가(감소) 시킴
		
		num3=10;
		result=num4+ --num3;
		System.out.println(result);
		result=num4+ num3--;
		System.out.println(result);
		System.out.println(num3);
	}

}
