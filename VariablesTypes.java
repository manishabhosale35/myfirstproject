package com.wipro.program;

public class VariablesTypes {

	int a = 10; // global variable/ instance variable/non-static variable

	int t = 36;

	static int p = 20; // static variable

	static { // static block

		System.out.println("In static block");
	}

	public static void main(String[] args) { // local variable

		System.out.println(p);

		VariablesTypes hw = new VariablesTypes();

		System.out.println(hw.a);

		System.out.println(hw.t);
 		 
}
 	}
 

