package factory;

import data.*;
import strategy.*;

public class CF2 extends AbstarctFactory {
	DS2 DS;
	CancelMsg_2 cm;
	DisplayCreditMsg_2 DCCM;
	DisplayMenu_2 dm;
	EnterPinMsg_2 epm;
	GasPumpedMsg_2 gpm;
	InitializeData_2 ind;
	PayMsg_2 pm;
	PrintReceipt_2 pr;
	PumpGasUnit_2 pgu;
	ReadyMsg_2 readym;
	RejectMsg_2 rm;
	ReturnCash_2 rc;
	SetInitialValues_2 siv;
	SetPrice_2 sp;
	StopMsg_2 sm;
	StoreCash_2 sc;
	StorePin_2 spin;
	StorePrices_2 sps;
	WrongPinMsg_2 wpm;
	
	public DS2 getDataStore() {
		if(DS == null)
			DS = new DS2();
		
		return DS;
	}
	public CancelMsg_2 getCancelMsg() {
		if(cm == null)
			cm = new CancelMsg_2();
		
		return cm;
	}
	public DisplayCreditMsg_2 getDisplayCreditMsg() {
		if(DCCM == null)
			DCCM = new DisplayCreditMsg_2();
		
		return DCCM;
	}
	public DisplayMenu_2 getDisplayMenu() {
		if(dm == null)
			dm = new DisplayMenu_2();
		
		return dm;
	}
	public EnterPinMsg_2 getEnterPinMsg() {
		if(epm == null)
			epm = new EnterPinMsg_2();
		
		return epm;
	}
	public GasPumpedMsg_2 getGasPumpedMsg() {
		if(gpm == null)
			gpm = new GasPumpedMsg_2();
		
		return gpm;
	}
	public InitializeData_2 getInitializeData() {
		if(ind == null)
			ind = new InitializeData_2();
		
		return ind;
	}
	public PayMsg_2 getPayMsg() {
		if(pm == null)
			pm = new PayMsg_2();
		
		return pm;
	}
	public PrintReceipt_2 getPrintReceipt() {
		if(pr == null)
			pr = new PrintReceipt_2();
		
		return pr;
	}
	public PumpGasUnit_2 getPumpGasUnit() {
		if(pgu == null)
			pgu = new PumpGasUnit_2();
		
		return pgu;
	}
	public ReadyMsg_2 getReadyMsg() {
		if(readym == null)
			readym = new ReadyMsg_2();
		
		return readym;
	}
	public RejectMsg_2 getRejectMsg() {
		if(rm == null)
			rm = new RejectMsg_2();
		
		return rm;
	}
	public ReturnCash_2 getReturnCash() {
		if(rc == null)
			rc = new ReturnCash_2();
		
		return rc;
	}
	public SetInitialValues_2 getSetInitialValues() {
		if(siv == null)
			siv = new SetInitialValues_2();
		
		return siv;
	}
	public SetPrice_2 getSetPrice() {
		if(sp == null)
			sp = new SetPrice_2();
		
		return sp;
	}
	public StopMsg_2 getStopMsg() {
		if(sm == null)
			sm = new StopMsg_2();
		
		return sm;
	}
	public StoreCash_2 getStoreCash() {
		if(sc == null)
			sc = new StoreCash_2();
		
		return sc;
	}
	public StorePin_2 getStorePin() {
		if(spin == null)
			spin = new StorePin_2();
		
		return spin;
	}
	public StorePrices_2 getStorePrices() {
		if(sps == null)
			sps = new StorePrices_2();
		
		return sps;
	}
	public WrongPinMsg_2 getWrongPinMsg() {
		if(wpm == null)
			wpm = new WrongPinMsg_2();
		
		return wpm;
	}
	
}
