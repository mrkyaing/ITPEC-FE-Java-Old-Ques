package com.itpec.april2017;

public class Tester1 {

	public static void main(String[] args) {
	Counter c=new Counter(0,60,"Second(s)");
	System.out.println(c);
	c.countDown();
	System.out.println(c);
     c.setValue(30);
     System.out.println(c);
     c.setValue(59);
     System.out.println(c);
     c.countUp();
     System.out.println(c);
     c.countUp();
     System.out.println(c);
     
	}

}
