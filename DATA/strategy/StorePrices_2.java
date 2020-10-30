package strategy;

import data.*;

public class StorePrices_2 extends StorePrices {

	@Override
	public void storePrices(Datastore DS) {
		DS.set_Sprice(DS.get_temp_a());
		DS.set_Rprice(DS.get_temp_b());
		DS.set_price(DS.get_temp_c());
		System.out.print("\n Prices saved.\n");
	}

}
