package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		//처리해야할 양이 많을 수록 시간차이가 많이 남
		//단순한 조회용도로 슬때는 ArrayList가 효율적이고
		//자료의 수정 복사 등을 해야할 때는 LinkedList가 더 효율적임
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int  i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간 :"+(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int  i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("linked 걸린시간 :"+(endTime-startTime)+"ns");
	}

}
