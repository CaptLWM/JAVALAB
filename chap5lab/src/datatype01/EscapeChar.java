package datatype01;
/*
 * Escape문자(\)
 * 문자열 내에서 특수한 기능을 수행하는 문자
 * \t(tab), \n(줄바꿈, line feed), 
 * \r(커서를 해당줄에서 맨 처음으로 이동, carrage return)
 * \':single quotation(문장 사이에 따옴표 넣을때 사용)
 * \":double quotation(비효율적임)
 * 
 */
public class EscapeChar {

	public static void main(String[] args) {
		
		System.out.println("My NickName is Superman\rxxxx");
		System.out.println("내이름은 신'이다");
		System.out.println("C:\nDrive\table");//\n \t이 활성화됨
		/*
		 * C:
		   Drive	able
		 */
		System.out.println("C:\\nDrive\\table");//\\두번은 비활성화
		
		/*
		 * 키보드로 엔터를 치면 13과 10이 저장됨
		 * 13은 \r
		 * 10은 \n
		 * 엔터키는 \r\n이다.
		 */
		
		/*
		 * Format String:출력형식을 지정하기 위한 형식 문자열
		 * %s나 %d등의 변환 지시어(Conversion Specifier)를
		 * 사용해서 원하는 출력형식을 만들 수 있다.
		 * 변환지시어를 쓸 수 있는 메소드는 정해져 있다.
		 * %s(문자열, 모든것 다 표현 가능), %d(정수), %f(실수), %c(문자),
		 * %b(boolean), %n(줄바꿈), %%(%문자표현)
		 */
		
		int kor=99, eng=80, math=96;
		double avg=(double)(kor+eng+math)/3;//정수형으로 연산했기 떄문에
		System.out.println(avg);
		
		System.out.println("[형식 문자열 미사용]");
		System.out.println("국어:"+kor+", 영어:"+eng+", 수학:"+math);
		
		System.out.println("[형식 문자열 사용]");
		System.out.printf("국어:%d 영어:%d 수학:%d 평균:%f\n",kor,eng,math,avg);
		System.out.printf("국어:%s 영어:%s 수학:%s 평균:%f\n",kor,eng,math,avg);
		
		/*
		 * 형식 문자열에서 데이터 출력시 자릿수 지정
		 * 예] %숫자d
		 * %4c : 한문자를 출력하는데 전체 자리수는 4
		 * %4d :  정수를 출력하는데 전체 자리수는 4
		 * %6.2f : 실수를 출력하는데 소수점 둘째자리까지만 출력, 전체자리수는 6(소수점 포함)
		 * 자릿수 지정시 값을 오른쪽부터 채운다
		 * -를 붙이면 왼쪽부터 채운다
		 * printf("%4d", 12);
		 * --12
		 * printf("%-4d", 12);
		 * 12--
		 */
		
		System.out.printf("%c %b %.2f %s %%%n",'가',true,3.141592323,"문자열");
		System.out.println("==========================================");
		System.out.printf("%20s%n","자바성적표");
		System.out.println("==========================================");
		System.out.printf("%-10s%-12s%-10s%s%n","KOREA","ENGLISH","MATH","평균");
		System.out.println("==========================================");
		System.out.printf("%-10d%-12d%-10d%d%n",kor,eng,math,(kor+eng+math)/3);
	}

}
