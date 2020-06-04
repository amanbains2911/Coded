package com.aman.factorymethod;

public class App {

	public static void main(String[] args) {
		BatchProcess bt= new BatchProcess();
		bt.processBatch(args[0]);
		System.out.println("Done");

	}

}
