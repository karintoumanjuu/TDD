package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
//		副作用？->timesメソッドを呼び出すたびに内部で保持しているamountが変わるから
//		ex) five.times(2) = 10, five.times(3) = 30(15じゃない)
		
		Dollar five = new Dollar(5);
		Dollar product  = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

}
