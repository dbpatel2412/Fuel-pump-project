package strategy;

import data.*;

public class SetPrice_1 extends SetPrice {

	@Override
	public void setPrice(int g, int M, Datastore DS) {
		if (g == 1) {
			//regular:1
			DS.set_Price(DS.get_Rprice());
		}
		else if (g == 4) {
			//diesel:4
			DS.set_Price(DS.get_Dprice());
		}
		System.out.println("\n Gas price has been set.\n");

	}

}
