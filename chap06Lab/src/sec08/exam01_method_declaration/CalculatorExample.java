package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:"+result1);
		
		//강제형변환 : 큰거를 작은거로 ex) byte(1)->int(4)
		//자동형변환 : 작은거를 큰거로 ex) byte(1)<-int(4)
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);//byte->int, 자동형변환
		System.out.println("result2:"+result2);
	}

}
