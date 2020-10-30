package strategy;

import data.*;

public class GasPumpedMsg_1 extends GasPumpedMsg {

	@Override
	public void gasPumpedMsg(int M, Datastore DS) {
		System.out.println("\n G= " + DS.get_G() + "; Total= " + DS.get_total() + "\n");
	}

}
