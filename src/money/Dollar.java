package money;

class Dollar extends Money {
	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multipiler) {
		return Money.dollar(this.amount * multipiler);
	}
}
