package sec03.exam01_name_implement_class;

public interface RemoteControl {
	// �������
	// 1.���
	/* public static final �������� */ int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 2.�߻�޼ҵ� ��ɾ��� �����⸸ �ִ°�
	/* abstarct void �������� */void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 3.����Ʈ�޼ҵ� ��� ����
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}
	
	// 4.�����޼ҵ�
	static void changeBattery() {
		System.out.println("���͸��� ��ü�մϴ�");
	}

}
