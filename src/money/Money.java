package money;

abstract class Money {
	protected int amount;

	abstract Money times(int multipiler);

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}

	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money Franc(int amount) {
		return new Franc(amount);
	}

}
