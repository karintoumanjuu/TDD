package money;

public class Franc extends Money {
	Franc(int amount) {
		this.amount = amount;
	}

	Money times(int multipiler) {
		return new Franc(this.amount * multipiler);
	}
}
