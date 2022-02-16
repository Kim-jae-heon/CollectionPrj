package com.KJH.app.util;
//Generic 방법으로 만드는 class
public class GtList<T> {

	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	public GtList() {
 
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity];
	}
	
	public void add(T num) {
		
		if(capacity <= current) {
			Object[] temp = new Object[capacity + amount];
			for(int i = 0; i < current; i++)
				temp[i] = nums[i];
			nums = temp;
			capacity += amount;
		}
		
		nums[current] = num;
		current++;
	}

	public void clear() {
//		for(int i = 0; i < current; i++)
//			nums[i] = 0;
		
//		nums = new int[3];
		current = 0;
	}

	public int size() {
		
		return current;
	}

	public T get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
			
		return (T)nums[index];
	}

}
