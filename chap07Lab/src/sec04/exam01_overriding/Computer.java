package sec04.exam01_overriding;

public class Computer extends Calculator {

	//@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		//return super.areaCircle(r);
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
