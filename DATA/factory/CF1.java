package factory;

import data.*;
import strategy.*;

public class CF1 extends AbstarctFactory {
	DS1 DS;
	CancelMsg_1 cm;
	DisplayCreditMsg_1 DCCM;
	DisplayMenu_1 dm;
	EnterPinMsg_1 epm;
	GasPumpedMsg_1 gpm;
	InitializeData_1 ind;
	PayMsg_1 pm;
	PrintReceipt_1 pr;
	PumpGasUnit_1 pgu;
	ReadyMsg_1 readym;
	RejectMsg_1 rm;
	ReturnCash_1 rc;
	SetInitialValues_1 siv;
	SetPrice_1 sp;
	StopMsg_1 sm;
	StoreCash_1 sc;
	StorePin_1 spin;
	StorePrices_1 sps;
	WrongPinMsg_1 wpm;
	
	public DS1 getDataStore() {
		if(DS == null)
			DS = new DS1();
		
		return DS;
	}
	public CancelMsg_1 getCancelMsg() {
		if(cm == null)
			cm = new CancelMsg_1();
		
		return cm;
	}
	public DisplayCreditMsg_1 getDisplayCreditMsg() {
		if(DCCM == null)
			DCCM = new DisplayCreditMsg_1();
		
		return DCCM;
	}
	public DisplayMenu_1 getDisplayMenu() {
		if(dm == null)
			dm = new DisplayMenu_1();
		
		return dm;
	}
	public EnterPinMsg_1 getEnterPinMsg() {
		if(epm == null)
			epm = new EnterPinMsg_1();
		
		return epm;
	}
	public GasPumpedMsg_1 getGasPumpedMsg() {
		if(gpm == null)
			gpm = new GasPumpedMsg_1();
		
		return gpm;
	}
	public InitializeData_1 getInitializeData() {
		if(ind == null)
			ind = new InitializeData_1();
		
		return ind;
	}
	public PayMsg_1 getPayMsg() {
		if(pm == null)
			pm = new PayMsg_1();
		
		return pm;
	}
	public PrintReceipt_1 getPrintReceipt() {
		if(pr == null)
			pr = new PrintReceipt_1();
		
		return pr;
	}
	public PumpGasUnit_1 getPumpGasUnit() {
		if(pgu == null)
			pgu = new PumpGasUnit_1();
		
		return pgu;
	}
	public ReadyMsg_1 getReadyMsg() {
		if(readym == null)
			readym = new ReadyMsg_1();
		
		return readym;
	}
	public RejectMsg_1 getRejectMsg() {
		if(rm == null)
			rm = new RejectMsg_1();
		
		return rm;
	}
	public ReturnCash_1 getReturnCash() {
		if(rc == null)
			rc = new ReturnCash_1();
		
		return rc;
	}
	public SetInitialValues_1 getSetInitialValues() {
		if(siv == null)
			siv = new SetInitialValues_1();
		
		return siv;
	}
	public SetPrice_1 getSetPrice() {
		if(sp == null)
			sp = new SetPrice_1();
		
		return sp;
	}
	public StopMsg_1 getStopMsg() {
		if(sm == null)
			sm = new StopMsg_1();
		
		return sm;
	}
	public StoreCash_1 getStoreCash() {
		if(sc == null)
			sc = new StoreCash_1();
		
		return sc;
	}
	public StorePin_1 getStorePin() {
		if(spin == null)
			spin = new StorePin_1();
		
		return spin;
	}
	public StorePrices_1 getStorePrices() {
		if(sps == null)
			sps = new StorePrices_1();
		
		return sps;
	}
	public WrongPinMsg_1 getWrongPinMsg() {
		if(wpm == null)
			wpm = new WrongPinMsg_1();
		
		return wpm;
	}
	
}
