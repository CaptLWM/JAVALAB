package sec02.exam01_none_generic_type;

public class Box /*extends Object*/{
	//클래스의 구성멤버
	//필드
	private Object object;//Class Object is the root of the class hierarchy
	
	//생성자
	
	//메소드
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
		
}
