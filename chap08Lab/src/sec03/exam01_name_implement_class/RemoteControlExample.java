package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rc:변수
		RemoteControl rc;
		
		//다형성
		rc = new Television(); //인터페이스변수 = TV 구현객체
		rc = new Audio();	//인터페이스 변수 = Audio구현객체
	}

}
