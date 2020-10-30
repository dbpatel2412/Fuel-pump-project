package states;

import gaspump_processor.*;

public class S7 extends state {
	
	public S7(MDA_EFSM md, OP op) {
		super(md, op);
	}

	public void CorrectPin( ) {
		OP.DisplayMenu();
		MD.changestate(3);
	}
	
	public void IncorrectPin( ) {
		System.out.println("ST1");
		OP.WrongPinMsg();
		System.out.println("ST2");
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
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		
	}
	
}
