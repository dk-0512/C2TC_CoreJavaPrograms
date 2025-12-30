package com.tnsif.nonaccessmodule;

public class StaicDemo {
	static int count;
	static {
		count=20;
		System.out.println("show the static"+"count asssigned:"+count);
	}
	static void show() {
		System.out.println("Method run in static"+"with count of:"+count);
	}
	public static void main(String args[]) {
		System.out.println("Static in main"+"method:"+count);
		show();
	}
}
 