package strategy;

import data.*;

public class SetPrice_2 extends SetPrice {

	@Override
	public void setPrice(int g, int M, Datastore DS) {
		if (g == 1) {
			//regular:1
			DS.set_Price(DS.get_Rprice());
		}
		else if (g == 2) {
			//super:2
			DS.set_Price(DS.get_Sprice());
		}
		else if (g == 3) {
			//premium:3
			DS.set_Price(DS.get_price());
		}
		System.out.println("\n Gas price has been set.\n");
		
	}

}
