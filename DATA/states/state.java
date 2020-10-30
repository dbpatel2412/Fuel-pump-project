package states;

import gaspump_processor.*;

public abstract class state {
	
	OP OP;
	MDA_EFSM MD;
	public state(MDA_EFSM md, OP op) {
		this.MD = md;
		this.OP = op;		
	}
	
	public abstract void Activate( );
	public abstract void Start( );
	public abstract void PayType(int t);
	public abstract void Reject( );
	public abstract void Cancel( );
	public abstract void Approved( );
	public abstract void StartPump(int M);
	public abstract void Pump(int M);
	public abstract void StopPump( );
	public abstract void SelectGas(int g, int M);
	public abstract void Receipt( );
	public abstract void NoReceipt( );
	public abstract void CorrectPin( );
	public abstract void IncorrectPin( );
	public abstract void Continue( );

}
