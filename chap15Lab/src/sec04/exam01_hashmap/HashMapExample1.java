package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);//���� ȫ�浿 ���� ������Ʈ
		System.out.println("�� Entry ��:"+map.size());//�� ��Ʈ�� ��:3
		
		//��ü ã��
		System.out.println("\tȫ�浿:"+map.get("ȫ�浿"));//ȫ�浿:95
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
			/* ��� =>
			 * ȫ�浿:95
			 * �ſ��:85
			 * ���屺:80
			 */
		System.out.println();
		
		//��ü����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��:"+map.size());//2
		
		//��ü�� �ϳ��� ó���ϴ� ��� 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		/* ��� =>
		 * �ſ��:85
		 * ���屺:80
		 */
		System.out.println();
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��:"+map.size());//0
	}

}
