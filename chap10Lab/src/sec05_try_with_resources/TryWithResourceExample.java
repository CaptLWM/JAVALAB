package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		/*FileInputStream fis = new FileInputStream("file.txt");
		try {
			fis.read();
		} catch (Exception e) {
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
		
	}
}
