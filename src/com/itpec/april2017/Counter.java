package com.itpec.april2017;

public class Counter {
private int value,limit;
private String label;

public Counter(int value,int limit,String label) {
	if(limit<=0) {
		throw new IllegalArgumentException();
	}
	this.limit=limit;
	setValue(value);
	this.label=label;
}

public int getValue() {
	return this.value;
}
public void setValue(int value) {
	if(value<0) {
		throw new IllegalArgumentException();
	}
	this.value=value%this.limit;//Question A
}

public void resetValue() {
	setValue(0);
}
public int getLimit() {
	return this.limit;
}
public void countUp() {
	setValue(getValue()+1);
}
public void countDown() {
	if(getValue()>0) {//Question B
		setValue(getValue()-1);
	}else {
		setValue(getLimit()-1);
	}
}
public String toString() {
	return this.label+":"+getValue();
}
}
