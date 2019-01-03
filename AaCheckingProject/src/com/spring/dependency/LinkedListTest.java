package com.spring.dependency;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		int middle = list.size()/2;
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer == middle) {
				iterator.remove();
			}
		}
	}
}