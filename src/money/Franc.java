package money;

public class Franc {

	private int amount;

	Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multipiler) {
		return new Franc(this.amount * multipiler);
	}

	public boolean equals(Object object) {
		Franc Franc = (Franc) object;
		return this.amount == Franc.amount;
	}

}
