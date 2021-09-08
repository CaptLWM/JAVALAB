package sec14.exam01_getther_setter;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.speed2 = -5;
		myCar.setSpeed(-5);

		System.out.println("현재속도:" + myCar.getSpeed);
		System.out.println("speed2 = " + myCar.speed2);

		// myCar.speed = -5
	}

}
