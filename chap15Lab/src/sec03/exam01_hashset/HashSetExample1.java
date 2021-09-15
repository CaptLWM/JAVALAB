package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스  변수 = new  구현클래스();
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//중복된게 있음, 기존위에 덮어쓴다 생각
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수:"+size);//"Java"가 중복됐기 때문에 4
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);//JAVA JDBC Servlet/JSP iBATIS
		}
		System.out.println();
		//iterator 없이 하는법
		for(String element : set) {
			System.out.println("  "+element);
		} //set 에서 하나씩 가져와서 출력
		
		set.clear();//set 비우기
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
