package com.tyss.javaapp.array.lambda;

import java.util.function.Function;

public class FucntionTest {

	public static void main(String[] args) {
		Function<String, Integer> fu = s -> s.length();//Fuit takes input of object type and returns objecttype 
		Integer d = fu.apply("ranjith");
		System.out.println("Length :" + d);
		
		//Square of given number
		
		Function<Integer,Integer> ff=a->a*a;
		System.out.println("square :"+ff.apply(6));

	}

}
