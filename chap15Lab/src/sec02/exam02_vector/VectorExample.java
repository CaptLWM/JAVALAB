package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

//�Խ��� ���鶧 �̷����
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<board> list = new Vector<board>();
		
		list.add(new board("����1","����1","�۾���1"));//0
		list.add(new board("����2","����2","�۾���2"));//1
		list.add(new board("����3","����3","�۾���3"));//2->����
		list.add(new board("����4","����4","�۾���4"));//3>����
		list.add(new board("����5","����5","�۾���5"));//4->2
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			board B = list.get(i);
			System.out.println(B.subject+"\t"+B.content+"\t"+B.writer+" "+i);
		}
	}

}
