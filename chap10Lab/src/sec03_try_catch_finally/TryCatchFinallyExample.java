package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			//���� ó�� �ڵ�, try �� �ڵ尡 �������Ǹ� �̺κ��� �۵�����
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}

