package com.demo.oops;
// extends and implements
public class InterfaceSn3 {

}
// debit card
interface X11 {
	public void mx();
}
// millenia debit card
interface Y11 extends X11{
	public void my();
}

class C11 {
}

class C21 extends C11 implements  Y11 {

	@Override
	public void mx() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void my() {
		// TODO Auto-generated method stub
		
	}

}
