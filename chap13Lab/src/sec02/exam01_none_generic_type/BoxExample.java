package sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");//object o = "홍길동", 자동형변환(부모형<-자식형)
		String name = (String) box.get();//강제형변환(부모형->자식형)
		
		box.set(new Apple());//Object o = new Apple();, 자동형변환(부모형<-자식형)
		Apple apple = (Apple)box.get();//강제형변환(부모형->자식형)		
		
	}
}
