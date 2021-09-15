package verify.exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i; // Garbage가 99개 생김
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(str);// 하나의 객체에서 업데이트
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		//str = sb.toString();
		System.out.println(str);
		
		///
	}
}
