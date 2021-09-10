package verify.exam05;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명구현 객체: new 인터페이스명(){추상메소드 구현};
		Action action = new Action() {

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("복사를 합니다.");
			}
			
		};
				
		action.work();
	}

}
