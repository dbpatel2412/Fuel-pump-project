package strategy;

import data.*;

public class GasPumpedMsg_2 extends GasPumpedMsg {

	@Override
	public void gasPumpedMsg(int M, Datastore DS) {
		if(M == 0)
			System.out.println("\n L= " + DS.get_L() + "\n");
		else if(M == 1)
			System.out.println("\n L= " + DS.get_L() + "; Total= " + DS.get_total() + "\n");
	}

}
