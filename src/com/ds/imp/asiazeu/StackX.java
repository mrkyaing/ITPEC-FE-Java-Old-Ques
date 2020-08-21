package com.ds.imp.asiazeu;

public class StackX {
private int[] data;
int sp;
public StackX(int n) {
	data=new int[n];
	sp=-1;
}
public void push(int item) {
	try {
		data[sp++]=item;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Stack Over flow.:( ");
		throw new ArrayIndexOutOfBoundsException();
	}
}
public int pop() {
	if(sp==-1) {
		System.out.println("Stack under flow. :( ");
		return -1;
	}
	return data[sp--];
}
}
