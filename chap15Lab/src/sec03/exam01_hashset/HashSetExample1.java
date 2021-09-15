package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������̽�  ���� = new  ����Ŭ����();
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//�ߺ��Ȱ� ����, �������� ����� ����
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��:"+size);//"Java"�� �ߺ��Ʊ� ������ 4
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);//JAVA JDBC Servlet/JSP iBATIS
		}
		System.out.println();
		//iterator ���� �ϴ¹�
		for(String element : set) {
			System.out.println("  "+element);
		} //set ���� �ϳ��� �����ͼ� ���
		
		set.clear();//set ����
		if(set.isEmpty()) {
			System.out.println("�������");
		}
		
	}

}
