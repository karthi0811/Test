package org.test;

public class GreensTech {

	public void greensOmr(String name, long phone) {
		System.out.println(" Greens location " + name);
		System.out.println(" Greens phone " + phone);
	}

	public void greensOmr(long phone, String name) {
		System.out.println(" Greens location " + name);
		System.out.println(" Greens phone " + phone);
	}

	public static void main(String[] args) {

		GreensTech obj = new GreensTech();
		obj.greensOmr(9974567234L, "Chennai");
		System.out.println("===============================");
		obj.greensOmr("OMR", 23456672343l);
	}
}
