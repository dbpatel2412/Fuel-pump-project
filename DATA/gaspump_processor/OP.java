package gaspump_processor;

import data.*;
import factory.*;
import strategy.*;

public class OP {
	AbstarctFactory af;
	Datastore d;
	CancelMsg cm;
	DisplayCreditMsg DCM;
	DisplayMenu dm;
	EnterPinMsg epm;
	GasPumpedMsg gpm;
	InitializeData ind;
	PayMsg pm;
	PrintReceipt pr;
	PumpGasUnit pgu;
	ReadyMsg readym;
	RejectMsg rm;
	ReturnCash rc;
	SetInitialValues siv;
	SetPrice sp;
	StopMsg sm;
	StoreCash sc;
	StorePin spin;
	StorePrices sps;
	WrongPinMsg wpm;
	
	public void setFactory(AbstarctFactory abs_fact) {
		af = abs_fact;
	}
	public void setDataStore(Datastore ds) {
		d = ds;
	}

	public void StorePrices() { // stores price(s) for the gas from the temporary data store
		sps = af.getStorePrices();
		sps.storePrices(d);
	}

	public void PayMsg() { // displays a type of payment method
		pm = af.getPayMsg();
		pm.displayPayMsg();
	}

	public void StoreCash() { // stores cash from the temporary data store
		sc = af.getStoreCash();
		sc.storeCash(d);
	}
	
	public void DisplayCreditMsg() { //wait for approval
		DCM = af.getDisplayCreditMsg();
		DCM.displayCreditMsg();
	}

	public void DisplayMenu() { // display a menu with a list of selections
		dm = af.getDisplayMenu();
		dm.displayMenu();
	}

	public void RejectMsg() { // displays credit card not approved message
		rm = af.getRejectMsg();
		rm.displayRejectMsg();
	}

	public void SetPrice(int g, int M) { // set the price for the gas identified by g identifier as in SelectGas(int g);
		sp = af.getSetPrice();
		sp.setPrice(g, M, d);
	}

	public void ReadyMsg() { // displays the ready for pumping message
		readym = af.getReadyMsg();
		readym.readyMsg();
	}

	public void SetInitialValues(int M) { // set G (or L) and total to 0;
		siv = af.getSetInitialValues();
		siv.setInitialValues(M, d);
	}

	public void PumpGasUnit(int M) { // disposes unit of gas and counts # of units disposed
		pgu = af.getPumpGasUnit();
		pgu.pumpGasUnit(M, d);
	}

	public void GasPumpedMsg(int M) { // displays the amount of disposed gas
		gpm = af.getGasPumpedMsg();
		gpm.gasPumpedMsg(M, d);
	}

	public void StopMsg() { // stop pump message and receipt? msg (optionally)
		sm = af.getStopMsg();
		sm.displaystopMsg();
	}

	public void PrintReceipt() { // print a receipt
		pr = af.getPrintReceipt();
		pr.PrintReceipt(d);
	}

	public void CancelMsg() { // displays a cancellation message
		cm = af.getCancelMsg();
		cm.displaycancelMsg();
	}

	public void ReturnCash() { // returns the remaining cash
		rc = af.getReturnCash();
		rc.returnCash(d);
	}

	public void WrongPinMsg() { // displays incorrect pin message
		System.out.println("op");
		wpm = af.getWrongPinMsg();
		wpm.displaywrongPinMsg();
		
	}

	public void StorePin() { // stores the pin from the temporary data store
		spin = af.getStorePin();
		spin.storePin(d);
	}

	public void EnterPinMsg() { // displays a message to enter pin
		epm = af.getEnterPinMsg();
		epm.displayenterPinMsg();
	}

	public void InitializeData() { // set the value of price and cash to 0
		ind = af.getInitializeData();
		ind.InitializeData(d);
	}

}
