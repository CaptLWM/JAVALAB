package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// singleton obj1 = new singleton();접근 안됨, 식별이 안됨(private로 막아서)
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singletonㅁ객체입니다.");
		}
	}

}
