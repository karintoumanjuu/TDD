package money;

class Dollar extends Money {
	Dollar(int amount) {
		this.amount = amount;
	}

	Money times(int multipiler) {
		return new Dollar(this.amount * multipiler);
	}

}
