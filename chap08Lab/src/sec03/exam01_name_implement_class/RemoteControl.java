package sec03.exam01_name_implement_class;

public interface RemoteControl {
	// 구성멤버
	// 1.상수
	/* public static final 생략가능 */ int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 2.추상메소드 기능없이 껍데기만 있는것
	/* abstarct void 생략가능 */void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 3.디폴트메소드 기능 보유
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 4.정적메소드
	static void changeBattery() {
		System.out.println("베터리를 교체합니다");
	}

}
