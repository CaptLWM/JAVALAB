package sec03.exam01_parent_constructor_call;

public class Student extends People { //부모쪽에 기본생성자 없음
	public int studentNo;
	
	//생성자
	Student(String name, String ssn, int studentNo){
		super(name, ssn);//부모를 먼저 호출
		//자식에서 부모 호출, 원래는 자동으로 만들어지지만 부모에 기본생성자 없기때문에 필요함
		this.studentNo = studentNo;//그다음 자식 호출
	}
}
