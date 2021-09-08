package sec13.exam03_field_method_access.package1.T;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;   
		a.field2 = 1;//public, 같은패키지 이기때문   
		//a.field3 = 1;//private   
		
		a.method1();  
		a.method2();  
		//a.method3();  
	}
}

