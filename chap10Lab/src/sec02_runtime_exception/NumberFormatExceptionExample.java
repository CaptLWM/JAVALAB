package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100"; //���������� ���ڿ�
		String data2 = "a100";

		//Integer.parseInt()�� �Ű������� ���ڿ��� ������ ��ȯ���ش�.
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);//NumberFormatException �߻�
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

