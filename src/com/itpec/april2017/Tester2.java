package com.itpec.april2017;

public class Tester2 {

	public static void main(String[] args) {
		CascadeCounter sec=new CascadeCounter(59,60,"sec");//value,limit,label
		CascadeCounter mins=new CascadeCounter(0,60,"mins");
		CascadeCounter hr=new CascadeCounter(0,24,"hr");
		sec.connectLeft(mins);
		mins.connectLeft(hr);
        sec.countUp();
        System.out.println("========");
        System.out.println(hr+":"+mins+":"+sec);//0,1,0
        mins.setValue(59);
        System.out.println("========");
        mins.countUp();
        System.out.println(hr+":"+mins+":"+sec);//1,0,0
	}

}
