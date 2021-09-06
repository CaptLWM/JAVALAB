package datatype01;
/*
 * 상수:저장된 값이 절대 변하지 않는 메모리의 한 종류
 * 선언방법:final 자료형 변수명=초기값;
 * 상수 선언 후 중간에 값을 변경하면 에러
 * 변수명(상수명)은 보통 대문자로 선언한다.
 * 상수는 프로그램의 가독성을 높이며 유지보수에도 유리하다.
 * 메소드(지역)안에서 상수를 선언할때는 초기화를 사용전에만 해주면 됨
 * 보통 메소드(지역) 안에서는 상수 선언을 안함
 * 주로 클래스 안에서 상수선언함 
 */

//클래스 안에 선언된 변수 멤버변수, 상수라 한다.
//메서드 안에 선언된 변수나 상수를 지역변수 혹은 지역 상수라한다.
public class Constantvaluable {
	//class안]
	//class 안에서 상수를 선언할때는
	//반드시 선언과 동시에 초기화를 해야함
	static final double PI=3.14;//[O] PI는 double 상수
	static final int SCISSORS=1;
	static final int rock=2;
	static final int paper=3;
	
	public static void main(String[] args) {//매서드, 이안에서 사용되는 변수는 지역변수
		System.out.println(PI);
		//PI=30;[x] 상수는 변경 불가 final이 있기 때문에
	

		int computer=1, user=2;
		computer=SCISSORS;
		System.out.println(computer);
		

	}

}
