package datatype01;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 1] 묵시적 형변환:
		 * 작은그릇의 데이터를 큰그릇에 넣을때
		 * => 형변환이 자동으로 일어남
		 * 
		 * 2] 명시적 형변환
		 * 큰그릇의 데이터를 작은그릇에 넣을때
		 * =>자료의 손실이 일어날 수 있음.
		 */
		
		byte b1=65; //1byte
		short s1; //2byte 
		s1=b1; // 묵시적 형변환
		System.out.println("b1:"+b1+",s1:"+s1);
		
		int num1=b1+s1; // 묵시적 형변환
		System.out.println(num1);
		
		char ch1=(char)b1;//명시적 형변환
		System.out.println(ch1);
		
		short s2=100;
		byte b2=(byte)s2;//명시적 형변환
		System.out.println("[데이터미손실]s2:"+s2+",b2:"+b2);
		
		int num2=300;
		b2=(byte)300;
		System.out.println("num2:"+num2+",[데이터손실]b2:"+b2);
		
		double d1=3.14;
		int num3=(int)(num2+d1);
		System.out.println("[데이터손실]num3:"+num3+",d1:"+d1);
		
		
	}

}
