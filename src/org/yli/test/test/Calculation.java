package org.yli.test.test;

import java.math.BigDecimal;

/**
 * User: yli
 * Date: 13-7-12
 * Time: 下午1:52
 */
public class Calculation {
	private BigDecimal dividend;
	private BigDecimal divisor;
	private BigDecimal answer;

	public Calculation(BigDecimal dividend, BigDecimal divisor) {
		this.dividend = dividend;
		this.divisor = divisor;
	}

	public BigDecimal getDividend() {
		return dividend;
	}

	public BigDecimal getDivisor() {
		return divisor;
	}

	public void setAnswer(BigDecimal ans) {
		this.answer = ans;
	}

	public BigDecimal getAnswer() {
		return answer;
	}

	public String printAnswer() {
		return "This answer of " + dividend + " divided by " + divisor + " is " + answer;
	}
}
