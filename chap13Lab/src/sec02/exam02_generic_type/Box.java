package sec02.exam02_generic_type;

/*public class Box {
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
		
}*/
//generic type 설계
public class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
