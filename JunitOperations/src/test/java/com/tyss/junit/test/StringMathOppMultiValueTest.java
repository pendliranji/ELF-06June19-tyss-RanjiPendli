package com.tyss.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tyss.junit.StringOperation;

@RunWith(Parameterized.class)
public class StringMathOppMultiValueTest {

	private StringOperation op = new StringOperation();
	private String name;
	private int value;

	public StringMathOppMultiValueTest(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	/*
	 * @Parameters public static Collection<?> mapp() { Object[][] obb = { {
	 * "ranji", 5 }, { "pendli", 6 }, { "ram", 3 } }; Map<Object, Object> map = new
	 * LinkedHashMap<>();
	 * 
	 * for (int i = 0; i < obb.length; i++) { map.put(obb[i], obb[i]); } return map;
	 * }
	 */

	@Parameters
	public static Collection<?> getpairs() {
		Object[][] ob = { { "ranji", 5 }, { "pendli", 6 }, { "ram", 3 } };

		ArrayList<Object> al = new ArrayList<>();//we can use Arrays.asList(ob) ,instead of creating arraylist obj
		for (int i = 0; i < ob.length; i++) {
			al.add(ob[i]);
		}

		return al;
	}

	@Test
	public void testCounterCharString() {
		int res = op.count(name);
		assertEquals(value, res);

	}

}
