
import java.util.Scanner;

import factory.*;
import gaspump_processor.*;
import states.*;

public class driver {
	public static void main(String[] args) {

		driver d = new driver();
		d.selectpump();

	}// main

	void selectpump() {
		char gp;
		boolean valid = false;
		while (!valid) {
			System.out.println("1. Gas pump 1");
			System.out.println("2. Gas pump 2");
			System.out.print("\nSelect pump:");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			gp = (char) sc.next().charAt(0);
			
			//Initialize Common Components
			OP op = new OP();
			MDA_EFSM MD = new MDA_EFSM();
			
			state state_list[] = new state[9];
			state_list[0] = new S0(MD, op);
			state_list[1] = new S1(MD, op);
			state_list[2] = new S2(MD, op);
			state_list[3] = new S3(MD, op);
			state_list[4] = new S4(MD, op);
			state_list[5] = new S5(MD, op);
			state_list[6] = new S6(MD, op);
			state_list[7] = new S7(MD, op);
			state_list[8] = new Active(MD, op);
			
			MD.setStateList(state_list);
			
			switch (gp) {
				case '1': {
					AbstarctFactory af1 = new CF1();
					op.setFactory(af1);
					selection_gp1(af1, MD, op);
					valid = true;
					break;
				}
				case '2': {
					AbstarctFactory af2 = new CF2();
					op.setFactory(af2);
					selection_gp2(af2, MD, op);
					valid = true;
					break;
				}
				default: {
					System.out.println("\nInvalid input. try again\n");
					valid = false;
					break;
				}
			}
		}
	}
	

	void selection_gp1(AbstarctFactory af1, MDA_EFSM MD, OP op) {
		GP1 gp1 = new GP1();
		gp1.set_MDAEFSM(MD);
		gp1.set_factory(af1);
		gp1.set_datestore();
		op.setDataStore(af1.getDataStore());
		
		float a, b;
		char ch;
		String pin;
		// Menu
		System.out.println("\t\t\t\t\tGasPump-1");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(float, float)");
		System.out.println("\t\t1. Start()");
		System.out.println("\t\t2. PayCredit()");
		System.out.println("\t\t3. Approved()");
		System.out.println("\t\t4. Reject()");
		System.out.println("\t\t5. PayDebit(string)");
		System.out.println("\t\t6. Pin(string)");
		System.out.println("\t\t7. Cancel()");
		System.out.println("\t\t8. Regular()");
		System.out.println("\t\t9. Diesel()");
		System.out.println("\t\ta. StartPump()");
		System.out.println("\t\tb. PumpGallon()");
		System.out.println("\t\tc. StopPump()");
		System.out.println("\t\td. FullTank()");
		System.out.println("\t\tq. Quit the program\n");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ch = '1';
		while (ch != 'q') {
			System.out.println("\n Select Operation: ");
			System.out.println(" 0-Activate, 1-Start, 2-PayCredit, 3-Approved, 4-Reject, 5-PayDebit, 6-Pin, 7-Cancel");
			System.out.println(" 8-Regular, 9-Diesel, a-StartPump, b-PumpGallon, c-StopPump, d-FullTank, q-quit");
			System.out.print(" Enter your choice: ");
			ch = (char) sc.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.println("\n Operation: Activate(float a, float b)");
				System.out.println(" Enter value for a:");
				a = sc.nextFloat();
				System.out.println(" Enter value for b:");
				b = sc.nextFloat();
				gp1.Activate(a,b);
				break;
			}
			case '1': { // Start
				System.out.println("\n Operation: Start()");
				gp1.Start();
				break;
			}
			case '2': { // PayCredit
				System.out.println("\n Operation: PayCredit()");
				gp1.PayCredit();
				break;
			}
			case '3': { // Approved
				System.out.println("\n Operation: Approved()");
				gp1.Approved();
				break;
			}
			case '4': {// Reject
				System.out.println("\n Operation: Reject()");
				gp1.Reject();
				break;
			}
			case '5': {// PayDebit
				System.out.println("\n Operation: PayDebit(string p)");
				System.out.println(" Enter value for p: ");
				pin = sc.next();
				gp1.PayDebit(pin);
				break;
			}
			case '6': {// Pin
				System.out.println("\n Operation: Pin(string pin)");
				System.out.println("\n Provide PIN for verification:");
				pin = sc.next();
				gp1.Pin(pin);
				break;
			}
			case '7': {// Cancel
				System.out.println("\n Operation: Cancel()");
				gp1.Cancel();
				break;
			}
			case '8': { // Regular
				System.out.println("\n Operation: Regular()");
				gp1.Regular();
				break;
			}
			case '9': { // Diesel
				System.out.println("\n Operation: Diesel()");
				gp1.Diesel();
				break;
			}
			case 'a': {// StartPump
				System.out.println("\n Operation: StartPump()");
				gp1.StartPump();
				break;
			}
			case 'b': {// PumpGallon
				System.out.println("\n Operation: PumpGallon()");
				gp1.PumpGallon();
				break;
			}
			case 'c': { // StopPump
				System.out.println("\n Operation: StopPump()");
				gp1.StopPump();
				break;
			}
			case 'd': { // FullTank
				System.out.println("\n Operation: FullTank()");
				gp1.FullTank();
				break;
			}
			case 'q':
				break;

			}// endswitch
		} // endwhile
	}
	
	void selection_gp2(AbstarctFactory af2, MDA_EFSM MD, OP op) {
		GP2 gp2 = new GP2();
		gp2.set_MDAEFSM(MD);
		gp2.set_factory(af2);
		gp2.set_datestore();
		op.setDataStore(af2.getDataStore());
		
		float a, b, c;
		int c1;
		char ch;
		// Menu
		System.out.println("\t\t\t\t\tGasPump-2");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(float, float, float)");
		System.out.println("\t\t1. PayCash(int)");
		System.out.println("\t\t2. PayCredit()");
		System.out.println("\t\t3. Approved()");
		System.out.println("\t\t4. Reject()");
		System.out.println("\t\t5. Cancel()");
		System.out.println("\t\t6. Premium()");
		System.out.println("\t\t7. Regular()");
		System.out.println("\t\t8. Super()");
		System.out.println("\t\t9. StartPump()");
		System.out.println("\t\ta. PumpLiter()");
		System.out.println("\t\tb. Stop()");
		System.out.println("\t\tc. Receipt()");
		System.out.println("\t\td. NoReceipt()");
		System.out.println("\t\tq. Quit the program\n");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ch = '1';
		while (ch != 'q') {
			System.out.println("\n Select Operation: ");
			System.out.println(" 0-Activate, 1-PayCash, 2-PayCredit, 3-Approved, 4-Reject, 5-Cancel, 6-Premium,");
			System.out.println(" 7-Regular, 8-Super, 9-StartPump, a-PumpLiter, b-Stop, c-Receipt, d-NoReceipt, q-quit");
			System.out.print(" Enter your choice: ");
			ch = (char) sc.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.println("\n Operation: Activate(float a, float b, float c)");
				System.out.println(" Enter value for a: ");
				a = sc.nextFloat();
				System.out.println(" Enter value for b: ");
				b = sc.nextFloat();
				System.out.println(" Enter value foc c: ");
				c = sc.nextFloat();
				gp2.Activate(a,b,c);
				break;
			}
			case '1': { // PayCash
				System.out.println("\n Operation: PayCash(int c)");
				System.out.println(" Enter value of the parameter c:");
				c1 = sc.nextInt();
				gp2.PayCash(c1);
				break;
			}
			case '2': { // PayCredit
				System.out.println("\n Operation: PayCredit()");
				gp2.PayCredit();
				break;
			}
			case '3': { // Approved
				System.out.println("\n Operation: Approved()");
				gp2.Approved();
				break;
			}
			case '4': {// Reject
				System.out.println("\n Operation: Reject()");
				gp2.Reject();
				break;
			}
			case '5': {// Cancel
				System.out.println("\n Operation: Cancel()");
				gp2.Cancel();
				break;
			}
			case '6': {// Premium
				System.out.println("\n Operation: Premium()");
				gp2.Premium();
				break;
			}
			case '7': { // Regular
				System.out.println("\n Operation: Regular()");
				gp2.Regular();
				break;
			}
			case '8': { // Super
				System.out.println("\n Operation: Super()");
				gp2.Super();
				break;
			}
			case '9': {// StartPump
				System.out.println("\n Operation: StartPump()");
				gp2.StartPump();
				break;
			}
			case 'a': { // PumpLiter
				System.out.println("\n Operation: PumpLiter()");
				gp2.PumpLiter();
				break;
			}
			case 'b': { // Stop
				System.out.println(" Operation: Stop()");
				gp2.Stop();
				break;
			}
			case 'c': { // Receipt
				System.out.println("\n Operation: Receipt()");
				gp2.Receipt();
				break;
			}
			case 'd': { // NoReceipt
				System.out.println("\n Operation: NoReceipt()");
				gp2.NoReceipt();
				break;
			}
			case 'q':
				break;

			}
		} 
	}
	
}
