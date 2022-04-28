class Account {
	String s, address, type;
	int accno;
	float amt, bal;

	Account() {
		s = "Angath";
		accno = 14;
		amt = 100000F;
		bal = amt;
	}

	Account(String s, String address, int accno, String type, float bal) {
		this.s = s;
		this.address = address;
		this.accno = accno;
		this.type = type;
		this.bal = bal;
	}

	void Display() {
		System.out.println("Name of Account Holder : " + s);
		System.out.println("Address of Account Holder : " + address);
		System.out.println(" Account number : " + accno);
		System.out.println(" Account type : " + type);
		System.out.println("The current balance : " + bal);
	}

	float Deposit(float x) {
		bal = bal + x;
		return bal;
	}

	float Withdraw(float y) {
		if (y > bal) {
			System.out.println("Insufficient balance");
		} else {
			bal = bal - y;
		}
		return bal;
	}

	float Get_Balance() {
		return bal;
	}
}

class Bank {
	public static void main(String args[]) {
		float wbal, dbal, bal;
		Account ob1 = new Account();
		Account ob2 = new Account("Angath", "kozhikode", 0014, "buisness", 100000F);
		ob2.Display();
		dbal = ob2.Deposit(10000F);
		System.out.println("The  balance after depositing is : " + dbal);
		wbal = ob2.Withdraw(20000F);
		System.out.println("The current balance after Withdrawal is : " + wbal);
		bal = ob2.Get_Balance();
		System.out.println("The current balance  is : " + bal);
	}
}