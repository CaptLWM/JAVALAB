package sec06.exam04_main_argument;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length  !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];//"3"
		String strNum2 = args[1];//"4"
		
		int num1 = Integer.parseInt(strNum1);
		//Integer.parseInt("",진수)는 숫자형의 문자를 진수에 맞게 숫자로 변환
		//"3"->3 
		int num2 = Integer.parseInt(strNum2);
		//"4"->4
		
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);

	}

}
