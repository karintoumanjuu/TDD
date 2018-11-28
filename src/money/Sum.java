package money;

public class Sum implements Expression {
	Expression augend;
	Expression addend;

	Sum(Expression augend, Expression addend){
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(Bank bank, String to) {
		int amount = this.augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	public Expression times(int multipiler) {
		return new Sum(this.augend.times(multipiler), this.addend.times(multipiler));
	}
}
