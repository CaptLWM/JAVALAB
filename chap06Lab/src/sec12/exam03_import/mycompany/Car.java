package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyundai.Engine;//모든 클래스 가지고 오려면 * 사용
import sec12.exam03_import.kumho.BigWidthTire;
//ctrl+shift+o => 한번에 import

public class Car {
	// 필드
	//sec12.exam03_import.hyundai.Engine engine = new sec12.exam03_import.hyundai.Engine();
	//import 안시켰으면 풀네임 다 적으면 됨
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
}
