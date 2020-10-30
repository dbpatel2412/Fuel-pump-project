package data;

public abstract class Datastore {
	
	//get, set methods for variables common for GasPump 1 and GasPump 2  
	public abstract float get_temp_a();
	public abstract void set_temp_a(float temp_a);
	public abstract float get_temp_b();
	public abstract void set_temp_b(float temp_b);
	public abstract float get_Price();
	public abstract void set_Price(float price);
	public abstract float get_total();
	public abstract void set_total(float total);
	public abstract float get_Rprice();
	public abstract void set_Rprice(float rprice);
	
	//get, set methods for GasPump 1 variables 
	public abstract String get_temp_p();
	public abstract void set_temp_p(String temp_p);
	public abstract String get_pin();
	public abstract void set_pin(String pin);
	public abstract int get_G();
	public abstract void set_G(int g);
	public abstract float get_Dprice();
	public abstract void set_Dprice(float dprice);
	
	//get, set methods for GasPump 2 variables 
	public abstract float get_temp_c();
	public abstract void set_temp_c(float temp_c);
	public abstract float get_temp_cash();
	public abstract void set_temp_cash(float temp_cash);
	public abstract float get_Sprice();
	public abstract void set_Sprice(float sprice);
	public abstract float get_price();
	public abstract void set_price(float pprice);
	public abstract float get_cash();
	public abstract void set_cash(float cash);
	public abstract int get_L();
	public abstract void set_L(int l);
	
}
