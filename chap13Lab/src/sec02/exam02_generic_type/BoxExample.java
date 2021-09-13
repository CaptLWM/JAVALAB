package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		/*Box box = new Box();
		box.set("홍길동");//object o = "홍길동", 자동형변환(부모형<-자식형)
		String name = (String) box.get();//강제형변환(부모형->자식형)
		
		box.set(new Apple());//Object o = new Apple();, 자동형변환(부모형<-자식형)
		Apple apple = (Apple)box.get();//강제형변환(부모형->자식형)		
		*/
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");//형변환이 없다.
		String str = box1.get();//형변환이 없다.
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		//box2.set(new Integer(6)); 같은거임
		int value = box2.get();
		
	}
}
