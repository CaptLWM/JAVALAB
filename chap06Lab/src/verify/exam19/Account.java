package verify.exam19;

public class Account {
	private int balance;

	void setBalance(int balance) {
		if (balance <= 0 || balance > 1000000)
			return;
		this.balance = balance;
	}

	int getBalance() {
		return balance;
	}
}
