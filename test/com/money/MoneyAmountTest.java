//import static org.junit.jupiter.api.Assertions.*;
////
//import org.junit.jupiter.api.Test;
package com.money;
import java.util.Random;
import java.util.Currency;
import java.math.BigDecimal;

class MoneyAmountTest {

//	@Test
	void test() {
//		BigDecimal amount = new BigDecimal(Math.random());
		BigDecimal amount = BigDecimal.valueOf(10000).movePointLeft(2);
		Currency dollars = Currency.getInstance("USD");
		MoneyAmount instance = new MoneyAmount(amount, dollars);
		String expector = "$100.00";
		String actual = instance.toString();
		String message = "expector is " + expector + " got " + actual;
		assert expector.equals(actual): message;
		System.out.println("Test Pass");
//		fail("Not yet implemented");
	}
	public static void main(String[] args) {
		new MoneyAmountTest().test();
	}

}
