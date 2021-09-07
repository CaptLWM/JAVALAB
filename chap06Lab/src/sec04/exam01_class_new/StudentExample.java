package sec04.exam01_class_new;

//실행용 클래스
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 객체를 만들어서 생성된 객체의 주소값을 s1 변수에 저장한다.
		//s1은 Student 객체를 참조하니까 s1은 생성된 Student 객체를 지칭한다. 
		Student s1 = new Student();//별도의 데이터 담기위해
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();//별도의 데이터 담기위해
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");

	}

}
