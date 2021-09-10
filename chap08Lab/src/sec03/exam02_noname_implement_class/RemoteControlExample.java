package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명구현객체: 인터페이스 변수 = new 인터페이스{추상메소드 재정의};
		// 여러개를 구현해야 한다면 클래스로 하는게 낫지만 하나만 구현해야하면
		// 유지보수를 위해 하나로 해버리는게 나음
		
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			//람다식:익명구현객체를 간략히 표현식
			//rc=()->{system.out.println("전원을 켭니다");};
		};
	}

}
