package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		/*Box box = new Box();
		box.set("ȫ�浿");//object o = "ȫ�浿", �ڵ�����ȯ(�θ���<-�ڽ���)
		String name = (String) box.get();//��������ȯ(�θ���->�ڽ���)
		
		box.set(new Apple());//Object o = new Apple();, �ڵ�����ȯ(�θ���<-�ڽ���)
		Apple apple = (Apple)box.get();//��������ȯ(�θ���->�ڽ���)		
		*/
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");//����ȯ�� ����.
		String str = box1.get();//����ȯ�� ����.
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		//box2.set(new Integer(6)); ��������
		int value = box2.get();
		
	}
}
