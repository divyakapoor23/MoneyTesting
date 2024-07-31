package com.money;
import java.util.Currency;
import java.math.BigDecimal;

public class MoneyAmount {
	BigDecimal amount;
	Currency cur;
	
	public MoneyAmount(BigDecimal amount, Currency cur){
		this.amount = amount;
		this.cur = cur;
	}
	public String toString() {
		
		return cur.getSymbol() + amount;
	}

	
}

