package states;

import gaspump_processor.*;

public class S1 extends state {
	
	public S1(MDA_EFSM md, OP op) {
		super(md, op);
	}

	public void PayType(int t) {
		//for pay_credit
		if(t == 1) {
			OP.DisplayCreditMsg();
			MD.changestate(2);
		}
		//for pay_cash
		else if(t == 2) {
			OP.StoreCash();
			OP.DisplayMenu();
			//MD.M = 0;
			MD.changestate(3);
		}
		//for pay_debit
		else if(t == 3) {
			OP.StorePin();
			OP.EnterPinMsg();
			MD.changestate(7);
		}
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StartPump(int M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pump(int M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectGas(int g, int M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CorrectPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		
	}
}
