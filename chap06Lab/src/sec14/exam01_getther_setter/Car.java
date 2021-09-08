package sec14.exam01_getther_setter;

public class Car {
	// 필드
	int speed2;
	private int speed;// 같은 패키지에서만 사용가능
	private boolean stop;// 같은 패키지에서만 사용가능
	public String getSpeed;

	// 생성자

	// 메소드
	// getter
	public int getSpeed() {// getspeed 를 호출하면
		return speed; // private로 막혀있던 speed를 호출
	}

	// setter
	public void setSpeed(int speed) {//
		if (speed < 0) {
			this.speed = 0;
			return;// 리턴될 값 없음->메소드 종료
		} else {
			this.speed = speed;
		}
	}

	// getter
	public boolean isStop() {
		return stop;
	}

	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
