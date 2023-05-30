package org.system;
//override
public class AxisBank extends BankInfo {
	
	 public void deposit()
	 {
   	  System.out.println("deposit the money");
     }
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	
	}

}
