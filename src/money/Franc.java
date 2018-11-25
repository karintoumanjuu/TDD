package money;

public class Franc extends Money {

	Franc(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multipiler) {
		return Money.franc(this.amount * multipiler);
	}
}
