package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//최상위 부모 A이므로 모두 받을 수 있음
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//
		B b1 = d;
		C c1 = e;
		
		/* 부모자식 관계가 아니므로 받을 수 없음
		B b2 = e;
		C c2 = d;
		*/
		
		/*
		 * Child c;
		 * Parent p = new Child(); //자동형변환, 부모형 <-자식형(참조영역이 축소됨)
		 * c=(child) p; // 강제형변환O
		 * 
		 * Parent p1 = new Parent(); 
		 * c=(Child)p1 // x, 자식타입이 자동으로 형변환 하지 않았기 때문에 강제 형변환 불가
		 */
	}

}
