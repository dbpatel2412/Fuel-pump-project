package strategy;

import data.*;

public class PrintReceipt_1 extends PrintReceipt {

	@Override
	public void PrintReceipt(Datastore DS) {
		System.out.println("\n Receipt");
		System.out.println(" -------------");
		System.out.println(" G = " + DS.get_G());
		System.out.println(" Total = " + DS.get_total());
		System.out.println(" -------------\n");
	}

}
