package money;

public class Franc extends Money {
	Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multipiler) {
		return new Franc(this.amount * multipiler);
	}
}
