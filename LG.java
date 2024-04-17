package com.interfaces;

public class LG implements Airconditioner {

	@Override
	public void display() {
		System.out.println("LG display method");

	}

	@Override
	public void cooling() {
		System.out.println("LG cooling method");

	}

	@Override
	public void swing() {
		System.out.println("LG swing method");

	}

	@Override
	public void cutoff() {
		System.out.println("LG cutoff method");
	}
	public void advance () {
		
		System.out.println("Advance  method");

	}
	

}
