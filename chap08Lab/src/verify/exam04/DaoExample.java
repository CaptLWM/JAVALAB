package verify.exam04;

public class DaoExample {
	//필드
	//생성자
	
	//메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// DataAccessObject dao = new OracleDao(); 자동형변환
		dbWork(new OracleDao());//구현객체
		// DataAccessObject dao = new MySQLDao(); 자동형변환
		dbWork(new MySQLDao());//구현객체
	}

}
