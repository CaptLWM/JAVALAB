package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=10;
		Calculator calculator = new Calculator();
		System.out.println("원면적:"+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();//overriding한 객체
		System.out.println("원면적:"+computer.areaCircle(r));
	}

}
