package strategy;

import data.*;

public class InitializeData_2 extends InitializeData {

	@Override
	public void InitializeData(Datastore DS) {
		DS.set_Price(0);
		DS.set_cash(0);
		System.out.println("\n Data initialized \n");
	}

}
