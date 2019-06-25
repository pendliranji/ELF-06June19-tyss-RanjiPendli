package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread{

	@Override
	public void run() {
		String s=this.getName();
		log.info("Name :"+s);
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		log.info("from run method :"+i+"---"+s);
		}
	}
}
