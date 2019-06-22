package com.tyss.javaapp.array;

public class MyArrayClass {
	private Object[] array;

	private int index;
	private Object[] array2;

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should not be zero or _VE");
		}
		array = new Object[size];

		index = 0;

	}

	public MyArrayClass() {
		this(9);

	}

	public void addToArray(Object ob) {

		if (index >= array.length) {
			array2 = new Object[10 * 2];
			System.arraycopy(array, 0, array2, 0, array2.length);
			array = array2;

		}
		array[index] = ob;
		index++;
		System.out.println("added");

	}

	public void removeFromArray(int ind) {
		System.out.println("removed index is:" + ind + "--------" + array[ind]);

		System.arraycopy(array, ind + 1, array, ind, array.length - ind);
		array[array.length - 1] = null;

	}

	public int size() {
		return index - 1;
	}

	public Object getfromArray(int ind) {

		return array[ind];
	}

}
