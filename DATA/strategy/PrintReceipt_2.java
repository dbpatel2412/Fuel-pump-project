package strategy;

import data.*;

public class PrintReceipt_2 extends PrintReceipt {

	@Override
	public void PrintReceipt(Datastore DS) {
		System.out.println("\n Receipt");
		System.out.println(" -------------");
		System.out.println(" L = " + DS.get_L());
		System.out.println(" Total = " + DS.get_total());
		System.out.println(" -------------\n");
	}

}
