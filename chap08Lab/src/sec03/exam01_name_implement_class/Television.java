package sec03.exam01_name_implement_class;

public class Television implements RemoteControl {
// 필드
	private int volume;

	@Override
	public void turnOn() {// 재정의
		System.out.println("TV를 켬");
	}

	@Override
	public void turnOff() {// 재정의
		System.out.println("TV를 끔");
	}

	@Override
	public void setVolume(int volume) {// 재정의
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:" + volume);

	}

}
