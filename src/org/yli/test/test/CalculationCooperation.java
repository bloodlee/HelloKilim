package org.yli.test.test;

import kilim.Mailbox;
import kilim.Task;

/**
 * Created with IntelliJ IDEA.
 * User: yli
 * Date: 13-7-12
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class CalculationCooperation {
  public static void main(String[] args) {
    Mailbox<Calculation> sharedMailbox = new Mailbox<Calculation>();

    Task deferred = new DeferredDivision(sharedMailbox);
    Task calculation = new Calculator(sharedMailbox);

    deferred.start();
    calculation.start();
  }
}
