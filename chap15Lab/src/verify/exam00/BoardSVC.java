package verify.exam00;
// DAO(Data Access Object) Ŭ����

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// �� �Է� ó�� �޼ҵ�
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ���:");
		String register = sc.next(); //���ο��� �Է¹��� ���� �ش������ �Է�

		System.out.print("�̸���:");
		String email = sc.next();

		System.out.print("��й�ȣ:");
		String passwd = sc.next();

		System.out.print("����:");
		String subject = sc.next();

		System.out.print("�۳���:");
		String content = sc.next();
		
		//�Է¹������� �������� BoardVO��ü ����
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);//�Է¹��� ��ü�� Article�̶� ��ü�� �Ű�������
	}

	// �� �ۼ�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۸�� ���
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}

	// ������ ���� �ۼ��� �� ��й�ȣ �Է��ϴ� �޼ҵ�
	public void removeArticle(Scanner sc) {
		System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���");
		System.out.print("�ۼ���:");
		String register = sc.next();
		
		System.out.print("��й�ȣ:");
		String passwd = sc.next();
		
		if(boardList.size()>0) {
			//����
			int cnt = 0;
			for(int i=0; i<boardList.size();i++) {
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPasswd().equals(passwd)) {
						//�����Ѵ�.
						boardList.remove(i);
						cnt++;//��� �ߴ��� Ȯ�ο�
						i--;//remove �ϸ� �ε����� ������� ������ size�� ����
						    //�ű⼭ ���� ������ ���� ���� i���� ���缭 �������
					}
				}
			}
			if(cnt==0) {
				System.out.println("�ۼ��ڰ� ���ų� ��й�ȣ ����ġ");
			} else {
				System.out.println("���������� ���� ���� �Ǿ����ϴ�");
			}
			
		} else {
			System.out.println("�ۼ��� ���� �������� �ʽ��ϴ�.");
		}
	}
		/*�����Ѱ�, �ΰ��̻� �ۼ��ϸ� ���� �ȵ�
		 * System.out.println("������ ���� �ۼ��ڸ� �Է��ϼ���");
		System.out.println("�ۼ���: ");
		String register = sc.next();
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getRegister().equals(register)) {
				System.out.println("������ ���� ��й�ȣ�� �Է��ϼ���");
				System.out.println("��й�ȣ: ");
				String passwd = sc.next();
				for (int j = 0; j < boardList.size(); j++) {
					if (boardList.get(j).getPasswd().equals(passwd)) {
						boardList.remove(boardList.get(j));
						System.out.println("���� �����Ǿ����ϴ�.");
				}
			
			}
			} else {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
	}*/
}

// �� ����
/*
 * public void removeArticle(String register, String passwd) { if
 * (boardList.size() > 0) { int sign = -1; for (int i = 0; i < boardList.size();
 * i++) { if (boardList.get(i).getRegister().equals(register)) { if
 * (boardList.get(i).getPasswd().equals(passwd)) {
 * boardList.remove(boardList.get(i)); sign = i--; } }
 * System.out.println("���� �����Ǿ����ϴ�."); } } }
 */
