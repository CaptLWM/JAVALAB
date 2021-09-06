package verify;

import java.util.Scanner;

public class DowhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner 클래스(객체)는 표준입력장치(키보드)에서 값을 입력받음
		int ran=(int)((Math.random()*100)+1);
		//0.0<=Math.random()<1.0 사이 실수를 임의로 발생
		//0<=(int)(Math.random()+100)+1<100 : 1~100사이의 임이의 정수값
		int cnt = 0, inNum = 0;
		
		do {
			System.out.println("1부터 100사이 숫자를 입력하세요");
			inNum = sc.nextInt();//표준입력장치에서 입력한 값을 정수로 불러옴
			
			if(inNum>ran) {
				System.out.println("작은수를 입력하세요");
			}
			else if (inNum<ran) {
				System.out.println("큰수를 입력하세요");
			}
			cnt = cnt+1;
		}while(inNum!=ran);
		
		System.out.println(cnt+"번에 맞췄습니다.");
		sc.close();

	}

}
