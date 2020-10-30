
import data.*;
import factory.*;
import gaspump_processor.*;

public class GP2 {
	AbstarctFactory af;
	Datastore d;
	MDA_EFSM MD;
	
	public void set_MDAEFSM(MDA_EFSM md) {
		MD = md;
	}
	public void set_factory(AbstarctFactory abs_fact) {
		af = abs_fact;
	}
	public void set_datestore() {
		d = af.getDataStore();
	}
	
	public void Activate(float a, float b, float c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			d.set_temp_a(a);
			d.set_temp_b(b);
			d.set_temp_c(c);
			MD.Activate();
			MD.Start();
		}
	}
	
	public void PayCash(float c) {
		if (c > 0) {
			d.set_temp_cash(c);
			//MD.Start();
			MD.PayType(2);
		}
	}
	
	public void PayCredit() {
		MD.Start();
		MD.PayType(1);
	}
	
	public void Reject() {
		MD.Reject();
	}
	
	public void Approved() {
		MD.Approved();
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Super() {
		MD.SelectGas(2);
		MD.Continue();
	}
	
	public void Premium() {
		MD.SelectGas(3);
		MD.Continue();
	}
	
	public void Regular() {
		MD.SelectGas(1);
		MD.Continue();
	}
	
	public void StartPump() {
		MD.StartPump();
	}
	
	public void PumpLiter() {
		if (d.get_cash() > 0 && (d.get_cash() < d.get_Price() * (d.get_L() + 1))) // TODO MD.M == 0
			MD.StopPump();
		else 
			MD.Pump();
	}
	
	public void Stop() {
		MD.StopPump();
	}
	
	public void Receipt() {
		MD.Receipt();
	}
	
	public void NoReceipt() {
		MD.NoReceipt();
	}

	
}
