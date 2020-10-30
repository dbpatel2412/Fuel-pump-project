package strategy;

import data.*;

public class PumpGasUnit_2 extends PumpGasUnit {

	@Override
	public void pumpGasUnit(int M, Datastore DS) {
		DS.set_L(DS.get_L() + 1);
		DS.set_total(DS.get_Price() * DS.get_L());
		System.out.println("\n Gas unit pumped.\n");
	}

}
