package sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");//object o = "ȫ�浿", �ڵ�����ȯ(�θ���<-�ڽ���)
		String name = (String) box.get();//��������ȯ(�θ���->�ڽ���)
		
		box.set(new Apple());//Object o = new Apple();, �ڵ�����ȯ(�θ���<-�ڽ���)
		Apple apple = (Apple)box.get();//��������ȯ(�θ���->�ڽ���)		
		
	}
}
