package strategy;

import data.*;

public class ReturnCash_2 extends ReturnCash {

	@Override
	public void returnCash(Datastore DS) {
		System.out.println("\n Return cash: " + (DS.get_cash() - DS.get_total()) + "\n");
	}

}
