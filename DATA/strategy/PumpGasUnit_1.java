package strategy;

import data.*;

public class PumpGasUnit_1 extends PumpGasUnit {

	@Override
	public void pumpGasUnit(int M, Datastore DS) {
		DS.set_G(DS.get_G() + 1);
		DS.set_total(DS.get_Price() * DS.get_G());
		System.out.println("\n Gas unit pumped.\n");
	}

}
