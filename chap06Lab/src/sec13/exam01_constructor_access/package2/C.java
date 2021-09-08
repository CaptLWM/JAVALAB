package sec13.exam01_constructor_access.package2;

import sec13.exam01_constructor_access.package1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1); 서로 다른 패키지 이기 때문
	//A a3 = new A("문자열");
}
