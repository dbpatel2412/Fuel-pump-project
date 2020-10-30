package states;

import gaspump_processor.*;

public class S5 extends state {
	
	public S5(MDA_EFSM md, OP op) {
		super(md, op);
	}

	public void Pump(int M) {
		OP.PumpGasUnit(M);
		OP.GasPumpedMsg(M);
	}
	
	public void StopPump( ) {
		OP.StopMsg();
		MD.changestate(6);
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
