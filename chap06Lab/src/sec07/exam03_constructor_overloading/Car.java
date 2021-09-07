package sec07.exam03_constructor_overloading;

public class Car {
	//클래스 구성멤버
	//1.필드
	String company="현대자동차";
	String model;
	String color; //null
	int maxSpeed; //0
	
	//2.생성자
	Car() {};
	//constructor overloading
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
