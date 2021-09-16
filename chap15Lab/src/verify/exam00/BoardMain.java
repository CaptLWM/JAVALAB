package verify.exam00;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();

		do {
			System.out.println();
			System.out.println("메뉴를 입력 하세요");
			System.out.println("1.게시판 글쓰기");
			System.out.println("2.글 목록 보기");
			System.out.println("3.글 삭제");
			System.out.println("4.종료");

			String menu = sc.next();//sc.next()는 키보드에서 입력을 기다림, 하나의 문자

			switch (menu) {
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticles(sc);
				break;
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
				System.out.println("프로그램을 종료합니다.");
			}

		} while (!isStop);
	}

}
