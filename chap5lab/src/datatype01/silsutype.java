package datatype01;

import java.math.BigDecimal;

public class silsutype {

	public static void main(String[] args) {
		//부동소수점 방식 : 가수부, 지수부
		//314 * 10^-2 , 앞을 가수부 뒤에 지수를 지수부, 컴퓨터에서 표현하는 방식
		//규칙1]정수형보다는 실수형이 더 큰 그릇이다.
		long ln=100;
		float fl=200;
		//fl = ln;
		//System.out.println(fl);//100.0으로 나옴(실수형이기 때문)
		//long ln=ln+fl;//[x] long형과 float형 연산 결과는 float
		float f2=ln+fl;
		System.out.println(f2);
		
		/*
		 * 규칙2] 실수형에서 기본 데이터 타입은 double
		 * 소수점이 붙으면 무조건 double형으로 인식
		 * 단, 소수점이 붙지 않은 값은 float에 담을 수 있다.
		 * (정수형은 int, 실수형은 double)
		 */
		
		//방법1] 형변환 float f3=(float)3.14;
		
		//방법2] 실수 뒤에 숫자 F나 f 를 붙임 float f3=3.14F;
		float f3=3.144f;
		System.out.println(f3);
		double d1=3.14;
		
		/*
		 * 규칙3] 실수형도 같은 자료형끼리의 연산결과는 같은 자료형
		 * 큰 자료형과 작은자료형과의 연산결과는 큰 자료형
		 */
		
		float f4=300, f5=500, f6;
		f6=f5+f4;
		
		double d2=f6;
		double d3=100.0;
		d2=d3+f6;
		System.out.println(d2);
		
		/*int radius=10;
		double pi=3.14;
		float area;
		area=(float)radius*(float)radius*(float)pi;
		
		System.out.println((int)area);*/
		
		double d4=0.10;
		double d5=0.20;
		System.out.println(d4+d5);//예상치 0.3/ 실제는 0.300000000000004
		System.out.println(d4*d5);
		/*
		 * 부동소수점 방식 연산 오류(지수로 표현되는 값이 0을 나타낼 수 없다.)
		 */
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println(big3);
		
		/*
		 * BigDecimal타입1.compareTo(Bigdecimal타입2)
		 * 값이같으면 0
		 * BigDecimal타입1 가리키는 값이 더 크면 1
		 * BigDecimal타입1 가리키는 값이 더 작으면 -1
		 */
		
		System.out.println(big3.compareTo(new BigDecimal("0.3"))==0);

	}////main

}////class end
