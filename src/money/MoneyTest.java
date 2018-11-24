package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
//		int型
//		副作用？
		Dollar five = new Dollar(5);
		five.times(2);
//		amountに直アクセス
		assertEquals(10, five.amount);
	}

}
