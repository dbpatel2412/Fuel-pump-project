package factory;

import data.*;
import strategy.*;

public abstract class AbstarctFactory {
	
	public abstract Datastore getDataStore();
	public abstract CancelMsg getCancelMsg();
	public abstract DisplayCreditMsg getDisplayCreditMsg();
	public abstract DisplayMenu getDisplayMenu();
	public abstract EnterPinMsg getEnterPinMsg();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract InitializeData getInitializeData();
	public abstract PayMsg getPayMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract ReadyMsg getReadyMsg();
	public abstract RejectMsg getRejectMsg();
	public abstract ReturnCash getReturnCash();
	public abstract SetInitialValues getSetInitialValues();
	public abstract SetPrice getSetPrice();
	public abstract StopMsg getStopMsg();
	public abstract StoreCash getStoreCash();
	public abstract StorePin getStorePin();
	public abstract StorePrices getStorePrices();
	public abstract WrongPinMsg getWrongPinMsg();
	
}
