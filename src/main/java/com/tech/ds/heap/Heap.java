package com.tech.ds.heap;

import java.lang.reflect.Array;

public abstract class Heap<T extends Comparable> {
	
	private static int MAX_SIZE = 40;
	private T[] array;
	private int count=0;
	
	public Heap(Class<T> clazz) {
		this(clazz,MAX_SIZE);
	}

	public Heap(Class<T> clazz, int size) {
		array = (T[]) Array.newInstance(clazz, size);
	}
	
	public int getLeftChildIndex(int index) {
		
		int leftChildIndex = index*2+1;
		if(leftChildIndex>=count ) {
			return -1;
		}
		return leftChildIndex;
	}
    public int geRightChildIndex(int index) {
		
		int rightChildIndex = index*2+2;
		if(rightChildIndex >=count ) {
			return -1;
		}
		return rightChildIndex;
	}
    
    public int getMaxIndex(int index) {
    	if(index <0 || index > count) {
    		return -1;
    	}
    	return (index-1)/2;
    }
    
    public int getCount() {
    	return count;
    }
    
    public boolean isFull() {
    	return count==array.length;
    }
    
    public boolean isEmpty() {
    	return count==0;
    }
    
    public T getElementAtIndex(int index) {
    	return array[index];
    }
}
