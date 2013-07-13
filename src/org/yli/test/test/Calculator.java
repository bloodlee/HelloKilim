package org.yli.test.test;

import kilim.Mailbox;
import kilim.Pausable;
import kilim.Task;

import java.math.RoundingMode;

/**
 * User: yli
 * Date: 13-7-12
 * Time: 下午2:04
 */
public class Calculator extends Task {

	private Mailbox<Calculation> mailbox;

	public Calculator(Mailbox<Calculation> mailbox) {
		super();
		this.mailbox = mailbox;
	}

	@Override
	public void execute() throws Pausable, Exception {
		while (true) {
			Calculation calc = mailbox.get();
      System.out.println("Get a calculation...");
      System.out.println("Dividend is " + calc.getDividend());
      System.out.println("Divisor is " + calc.getDivisor());
      if (calc.getAnswer() == null) {
				calc.setAnswer(calc.getDividend().divide(calc.getDivisor(), 8, RoundingMode.HALF_UP));
			}
			System.out.println("Calculator determined answer.");
			mailbox.putnb(calc);
      Task.sleep(1000);
		}
	}
}
