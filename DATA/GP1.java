
import data.*;
import factory.*;
import gaspump_processor.*;

public class GP1 {
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
	
	public void Activate(float a, float b) {
		if ((a > 0) && (b > 0)) {
			d.set_temp_a(a);
			d.set_temp_b(b);
			MD.Activate();
		}
	}
	
	public void Start() {
		MD.Start();
	}
	
	public void PayCredit() {
		MD.PayType(1);
	}
	
	public void Reject() {
		MD.Reject();
	}
	
	public void PayDebit(String p) {
		d.set_temp_p(p);
		System.out.println("pin set-"+d.get_temp_p());
		MD.PayType(3);
	}
	
	public void Pin(String x) {
		String y=x;
		if (y.equals(x)) 
			MD.CorrectPin();
		else 
			MD.IncorrectPin();
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Approved() {
		MD.Approved();
	}
	
	public void Diesel() {
		MD.SelectGas(4);
	}
	
	public void Regular() {
		MD.SelectGas(1);
	}
	
	public void StartPump() {
		if (d.get_Price() > 0) {
			MD.Continue();
			MD.StartPump();
		}
	} 
	
	public void PumpGallon() {
		MD.Pump(); 
	}
	
	public void StopPump() {
		MD.StopPump();
		MD.Receipt();
	}
	
	public void FullTank() {
		MD.StopPump();
		MD.Receipt();
	}
	
}
