package com.app;

import java.util.Arrays;

public class Test {
	
	static int x=30;
	void m1() {
		int a[]= {1,2,4,5,6};
		Arrays.sort(a);
		int id=getA(a,a.length);
		getA(a,5);
	}
	public static int getA(int a[],int n) {
		int i,tot;
		tot=(n+1)*(n+2)/2;
		for(i=0;i<n;i++) {
			tot=tot-a[i];
		}
		return tot;
	}
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println(x);
		System.out.println(x=20);
		int b=10;
		System.out.println(b);
		b=30;
		System.out.println(b);
		
		int a[]= {1,2,4,5,6};
		Arrays.sort(a);
		int id=getA(a,a.length);
		System.out.println(id);
		
	//Singleton si=(Singleton) Class.forName("com.app.Singleton").newInstance();
		//System.out.println(si);
		
		
		
		Singleton s1=Singleton.s;
		System.out.println(s1.hashCode());
		
		Singleton s=(Singleton)s1.clone();
		System.out.println(s.hashCode());
		
		
		
	}

}
