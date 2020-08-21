package com.itpec.april2017;

public class CascadeCounter extends Counter{
private Counter leftSide;
	public CascadeCounter(int value, int limit, String label) {
		super(value, limit, label);
	}
	
	public void countUp() {//Q c & D
		if((getValue()+1==getLimit()) && leftSide!=null) {
			leftSide.countUp();
		}
		super.countUp();
	}
	
	public void countDown() {
		if(getValue()==0 && leftSide!=null) {
			leftSide.countDown();
		}
		super.countDown();
	}
public void resetValue() {
	if(leftSide!=null) {
		leftSide.resetValue();
	}
}
public void connectLeft(Counter left) {
	this.leftSide=left;
}
public void disconnectLeft() {
	this.leftSide=null;
}
public String toStrig() {
	String str=" ";
	if(leftSide!=null) {
		str+=leftSide;
	}
	str+=" "+(super.toString());
	return str;
}
}
