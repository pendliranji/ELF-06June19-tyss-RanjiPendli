package com.tyss.javaapp.array.lambda;

public class MethodRefEx {

	public static void main(String[] args) {

		InterfaceEx inf = Demo::sum;

		int sum = inf.add(8, 5);
		System.out.println(sum);

		InterfaceEx2 inf1 = new Demo()::average;
		inf1.avg(1, 2, 3);
		
		Factorial r=new Demo()::fact;
		r.factorial(5);

	}

}
