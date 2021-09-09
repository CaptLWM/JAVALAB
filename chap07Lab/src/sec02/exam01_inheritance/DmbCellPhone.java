package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {// 부모클래스(superclass)
	// 필드
	int channel;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model; // 부모클래스에 있는 필드 상속
		this.color = color; // 부모클래스에 있는 필드 상속
		this.channel = channel; // 부모클래스에 있는 필드 상속
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
