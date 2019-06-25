package com.tyss.javaapp.array.lambda;

public class Test {

	public static void main(String[] args) {

		PenFactory pen = Pen::new;
		Pen p = pen.getPen();
		p.write();

		PenFactory1 pf = Pen::new;
		Pen pen1 = pf.getPen(15);
		pen1.write();
	}
}