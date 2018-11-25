package money;

class Dollar {
	private int amount;

	Dollar(int amount) {
		this.amount = amount;
	}

	Dollar times(int multipiler) {
		return new Dollar(this.amount * multipiler);
	}

	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return this.amount == dollar.amount;
	}
}
