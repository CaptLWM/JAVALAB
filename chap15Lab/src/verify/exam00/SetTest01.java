package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
//1~45���� ���� ����

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		// Set s = new HashSet();//������ ������
		TreeSet s = new TreeSet();// ���ĵ� ����

		Random r = new Random();

		while (s.size() < 6) { // �ߺ��� ���� ����� �ݿ����� ����
			s.add(r.nextInt(45) + 1);// 0~44 + 1 =>1~45 �� set�� �Է�
		}
		System.out.println(s);
		/*
		 * ���� �Ѱ�
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
