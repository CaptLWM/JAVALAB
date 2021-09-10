package verify.exam04;

//구현 클래스
public class MySQLDao implements DataAccessObject {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에 삽입");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB를 수정");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB를 삭제");
	}

}
