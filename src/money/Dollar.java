package money;

class Dollar {
	int amount;
	
	Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multipiler) {
		return new Dollar(this.amount * multipiler);
	}
}
