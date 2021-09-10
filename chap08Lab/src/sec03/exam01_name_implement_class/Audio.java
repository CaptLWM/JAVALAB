package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl {
// 필드
	private int volume;

	@Override
	public void turnOn() {// 재정의
		System.out.println("Audio를 켬");
	}

	@Override
	public void turnOff() {// 재정의
		System.out.println("Audio를 끔");
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
		System.out.println("현재 Audio 볼륨:" + volume);

	}

}
