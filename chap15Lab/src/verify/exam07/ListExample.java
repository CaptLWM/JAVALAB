package verify.exam07;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		//타입변수 = new 생성자;
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
