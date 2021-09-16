package verify.exam00;
// DAO(Data Access Object) 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// 글 입력 처리 메소드
	public void writeArticle(Scanner sc) {
		System.out.println("게시판에 글을 작성 하세요.");
		System.out.print("작성자:");
		String register = sc.next(); //메인에서 입력받은 문자 해당공간에 입력

		System.out.print("이메일:");
		String email = sc.next();

		System.out.print("비밀번호:");
		String passwd = sc.next();

		System.out.print("제목:");
		String subject = sc.next();

		System.out.print("글내용:");
		String content = sc.next();
		
		//입력받은것을 바탕으로 BoardVO객체 생성
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);//입력받은 객체를 Article이란 객체의 매개변수로
	}

	// 글 작성
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 글목록 출력
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("등록된 글이 없습니다.");
		}
	}

	// 삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc) {
		System.out.println("삭제할 글의 작성자와 비밀번호를 입력하세요");
		System.out.print("작성자:");
		String register = sc.next();
		
		System.out.print("비밀번호:");
		String passwd = sc.next();
		
		if(boardList.size()>0) {
			//삭제
			int cnt = 0;
			for(int i=0; i<boardList.size();i++) {
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPasswd().equals(passwd)) {
						//삭제한다.
						boardList.remove(i);
						cnt++;//몇번 했는지 확인용
						i--;//remove 하면 인덱스가 당겨지기 때문에 size도 감소
						    //거기서 오는 오류를 막기 위해 i값을 낮춰서 재검토함
					}
				}
			}
			if(cnt==0) {
				System.out.println("작성자가 없거나 비밀번호 미일치");
			} else {
				System.out.println("성공적으로 글이 삭제 되었습니다");
			}
			
		} else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
		/*내가한것, 두개이상 작성하면 삭제 안됨
		 * System.out.println("삭제할 글의 작성자를 입력하세요");
		System.out.println("작성자: ");
		String register = sc.next();
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getRegister().equals(register)) {
				System.out.println("삭제할 글의 비밀번호를 입력하세요");
				System.out.println("비밀번호: ");
				String passwd = sc.next();
				for (int j = 0; j < boardList.size(); j++) {
					if (boardList.get(j).getPasswd().equals(passwd)) {
						boardList.remove(boardList.get(j));
						System.out.println("글이 삭제되었습니다.");
				}
			
			}
			} else {
				System.out.println("다시입력하세요");
			}
		}
	}*/
}

// 글 삭제
/*
 * public void removeArticle(String register, String passwd) { if
 * (boardList.size() > 0) { int sign = -1; for (int i = 0; i < boardList.size();
 * i++) { if (boardList.get(i).getRegister().equals(register)) { if
 * (boardList.get(i).getPasswd().equals(passwd)) {
 * boardList.remove(boardList.get(i)); sign = i--; } }
 * System.out.println("글이 삭제되었습니다."); } } }
 */
