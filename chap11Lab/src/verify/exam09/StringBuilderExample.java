package verify.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i; // Garbage�� 99�� ����
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(str);// �ϳ��� ��ü���� ������Ʈ
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		//str = sb.toString();
		System.out.println(str);
		
		///
	}
}
