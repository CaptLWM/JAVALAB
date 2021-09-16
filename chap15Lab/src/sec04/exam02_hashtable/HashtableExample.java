package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		// Scanner ��ü�� Ű���忡�� ���� �Է¹���
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���");
			System.out.print("ID: ");
			String id = scanner.nextLine();// �Է��� ������ �о StringŸ������ ��ȯ

			if (map.containsKey(id)) {

				System.out.print("��й�ȣ: ");
				String password = scanner.nextLine();// �Է��� ������ �о StringŸ������ ��ȯ
				System.out.println();

				if (map.get(id).equals(password)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

}
