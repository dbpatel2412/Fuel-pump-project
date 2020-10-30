package strategy;

import data.*;

public class StoreCash_2 extends StoreCash {

	@Override
	public void storeCash(Datastore DS) {
		DS.set_cash(DS.get_temp_cash());
		System.out.println("\n Cash stored.\n");
	}

}
