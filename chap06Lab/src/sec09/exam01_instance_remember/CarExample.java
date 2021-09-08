package sec09.exam01_instance_remember;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run(); // 인스턴스 메소드
		yourCar.run(); // 인스턴스 메소드
		
		myCar.model = "제네시스";
		myCar.run(); // 인스턴스 메소드
		
	}

}
