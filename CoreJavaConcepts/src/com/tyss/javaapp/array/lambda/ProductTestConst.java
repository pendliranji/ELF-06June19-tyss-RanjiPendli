package com.tyss.javaapp.array.lambda;

public class ProductTestConst {
	public static void main(String[] args) {
		Productinterface pf = Product::new;

		Product p =
				pf.details("car", 53.6);
		System.out.println("Product Details :" + p);

	}

}
