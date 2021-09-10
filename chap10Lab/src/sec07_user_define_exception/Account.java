package sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			//throws는 예외 떠넘기기
			//throw는 예외를 발생시킴
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}

