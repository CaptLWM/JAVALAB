package sec08.exam02_abstract_method;

public abstract class Animal {
	//추상클래스의 구성멤버
	//필수
	public String kind;

	//생성자
	
	//일반메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	public abstract void sound();//{}가 없음, 자동으로 자식클래스에 재정의됨, 강제적으로 반영
}
