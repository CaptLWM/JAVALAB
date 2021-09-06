package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVal1="신민철";
		String strVal2="신민철";
		
		System.out.println("strVal1="+System.identityHashCode(strVal1));
		System.out.println("strVal2="+System.identityHashCode(strVal2));
		
		if(strVal1 == strVal2) {
			System.out.println("strVsal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVsal1과 strVal2는 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVsal1과 strVal2는 문자열이 같음");
		} else {
			System.out.println("strVsal1과 strVal2는 문자열이 다름");
		}
		
		String strVal3=new String("신민철");
		String strVal4=new String("신민철");
		
		if(strVal3 == strVal4) {//주소값을 비교
			System.out.println("strVsal3과 strVal4는 참조가 같음");
		} else {
			System.out.println("strVsal3과 strVal4는 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) {//객체의 문자열을 비교
			System.out.println("strVsal3과 strVal4는 문자열이 같음");
		} else {
			System.out.println("strVsal3과 strVal4는 문자열이 다름");
		}
		

	}

}
 