package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cannot instantiate the type Phone
		//Phone phone = new Phone("ȫ�浿");
		
		Smartphone smartPhone = new Smartphone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
