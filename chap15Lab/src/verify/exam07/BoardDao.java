package verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//필드
	//생성자 => 리턴 타입이 없음
	
	//메소드0
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
}
