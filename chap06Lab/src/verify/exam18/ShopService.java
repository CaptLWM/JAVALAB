package verify.exam18;

public class ShopService {
	private static ShopService singleton = new ShopService();

	private ShopService() {
	} // 기본생성자

	static ShopService getInstance() {
		return singleton;
	}
}
