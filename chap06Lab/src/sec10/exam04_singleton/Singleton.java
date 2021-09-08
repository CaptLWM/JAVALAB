package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}
	
	//정적메소드
	static Singleton getInstance() {
		return singleton;
	}

}
