package sec08.exam01_abstract_class;

public abstract class Phone {
	//추상클래스의 구성멤버
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//추상메소드
	///일반메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
