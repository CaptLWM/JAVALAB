package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
//1~45사이 임의 정수

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		// Set s = new HashSet();//정렬은 안해줌
		TreeSet s = new TreeSet();// 정렬도 해줌

		Random r = new Random();

		while (s.size() < 6) { // 중복된 값은 사이즈에 반영되지 않음
			s.add(r.nextInt(45) + 1);// 0~44 + 1 =>1~45 를 set에 입력
		}
		System.out.println(s);
		/*
		 * 내가 한것
		 * 		while(true) { 
		 * 			n = r.nextInt(45)+1; 
		 * 			s.add(n); 
		 * 			if (s.size()==6) {
		 * 				System.out.println(s); 
		 *   		}
		 * 		}
		 */
	}

}
