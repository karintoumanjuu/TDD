package money;

class Money implements Expression {
	protected int amount;
	protected String currency;

	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}

	Money times(int multipiler) {
		return new Money(this.amount * multipiler, this.currency);
	};

	String currency() {
		return this.currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && currency().equals(money.currency());
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public String toString() {
		return this.amount + " " + this.currency;
	}

	Expression plus(Money added) {
		return new Sum(this, added);
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(this.currency, to);
		return new Money(this.amount/ rate, to);
	}

}
