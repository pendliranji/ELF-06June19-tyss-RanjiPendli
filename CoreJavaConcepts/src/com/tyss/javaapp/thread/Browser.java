package com.tyss.javaapp.thread;

public class Browser extends Thread{

	Pvr ref;
	Browser(Pvr ref){
		this.ref=ref;
	}
	
	@Override
	public void run() {
	ref.book();
	
	}
}
