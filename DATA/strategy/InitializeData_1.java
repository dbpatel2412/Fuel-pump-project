package strategy;

import data.*;

public class InitializeData_1 extends InitializeData {

	@Override
	public void InitializeData(Datastore DS) {
		DS.set_Price(0);
		System.out.println("\n Data initialized \n");
	}

}
