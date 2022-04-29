package com.demo.oops;
// implement another realtime example
public class EncapsulationEx {
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
//		The field CreditCard.pin is not visible
//		System.out.println(creditCard.pin);
		creditCard.setPinNo(12345);
		creditCard.setPinNo(0);
		System.err.println(creditCard.getCardNo());
	}
}

class CreditCard {
	// encapsulation / fields and methods inside class
	private int pinNo = 1234;
	private String cardNoString = "1234432112344321";
	// setter
	public void setPinNo(int pinNo) {
		//check for 4 digits
		String pinNoString = Integer.toString(pinNo);
		if(pinNoString.length() > 0 && pinNoString.length() <5) {
			this.pinNo = pinNo;
			System.err.println("Successfully set pin number");
		}else {
			System.err.println("Invalid Pin Number");
		}
	}
	public String getCardNo() {
		String encodedCardNoString = "XXXXXXXXXXXX4321";
		return encodedCardNoString;
	}
}