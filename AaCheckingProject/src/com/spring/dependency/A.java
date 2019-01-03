package com.spring.dependency;

public class A {

	static int i = B.j;

	public String toString() {

		return "" + i;
	}

	public static void main(String[] args) {

		System.out.println(A.i);
	}
}

class B {

	static int j = C.k;
}

class C {

	static int k = D.value();
}

class D {
	
	static int value() {
	return 10;
	}
}