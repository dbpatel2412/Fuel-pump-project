package strategy;

import data.*;

public class StorePin_1 extends StorePin {

	@Override
	public void storePin(Datastore DS) {
		DS.set_pin(DS.get_temp_p());
		System.out.println("\n P saved.\n");
	}

}
