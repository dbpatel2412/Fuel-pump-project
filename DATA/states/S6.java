package states;

import gaspump_processor.*;

public class S6 extends state {
	
	public S6(MDA_EFSM md, OP op) {
		super(md, op);
	}

	public void Receipt( ) {
		OP.PrintReceipt();
		OP.ReturnCash();
		MD.changestate(0);
	}
	
	public void NoReceipt( ) {
		OP.ReturnCash();
		MD.changestate(0);		
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
	public void PayType(int t) {
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
