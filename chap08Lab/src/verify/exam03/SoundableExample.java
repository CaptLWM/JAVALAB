package verify.exam03;
	
public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		//Soundable soundable = new Cat();
		//�������̽� ���� = ������ü;, �ڵ�����ȯ

		printSound(new Dog());
		//������
	}

}
