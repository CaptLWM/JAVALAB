package sec07.exam04_other_constructor_call;

public class Car {
	//클래스 구성멤버
	//1.필드
	String company="현대자동차";
	String model;
	String color; //null
	int maxSpeed; //0
	
	//2.생성자
	Car() {};
	//생성자 오버로딩(constructor overloading)
	//this:자기 자신의 객체를 의미한다.
	//this():자기 자신의 객체의 다른 생성자를 의미한다.
	//super:부모객체
	//super():부모객체의 생성자
	Car(String model) {
		//this.model = model;
		this(model,null,0);
		//첫번째칸은 내가 필요한것, 나머지는 빈칸
	}
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model,color,0);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		//this(model, color, 0);
	}
	

}
