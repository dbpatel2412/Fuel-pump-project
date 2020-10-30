package strategy;

import data.*;

public class SetInitialValues_1 extends SetInitialValues {

	@Override
	public void setInitialValues(int M, Datastore DS) {
		DS.set_G(0);
		System.out.println("\n Initial value has been set\n");
	}

}
