package strategy;

import data.*;

public class SetInitialValues_2 extends SetInitialValues {

	@Override
	public void setInitialValues(int M, Datastore DS) {
		if(M == 0) {
			DS.set_L(0);
		}
		else if(M == 1) {
			DS.set_Price((float) (DS.get_Price() * 1.1));
			DS.set_L(0);
		}
		System.out.println("\n Initial value has been set\n");
		
	}

}
