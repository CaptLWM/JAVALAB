package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java");//0
		list.add("JDBC");//1
		list.add("iBatis");//4
		list.add("servlet/JSB");//2->3
		list.add(2,"Database");//2, servlet/JSB�� �з��� 3�ڸ��� ���Ե�
		list.add("iBatis");//4
		
		int size = list.size();
		System.out.println("�� ��ü��:"+size);
		System.out.println();
			
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		for(int i=0 ; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove("iBatis");//������ �־ �ϳ��� ������
		for(int i=0 ; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
	}

}
