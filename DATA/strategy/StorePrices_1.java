package strategy;

import data.*;

public class StorePrices_1 extends StorePrices {

	@Override
	public void storePrices(Datastore DS) {
		DS.set_Rprice(DS.get_temp_a());
		DS.set_price(DS.get_temp_b());
		System.out.print("\n Prices saved.\n");
	}

}
