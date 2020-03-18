package com.basic;

public class Fibannoci {

	//printing fib inside loop
	public static void main(String[] args) {
		int n1=0; int n2=1;int n=8;int fib=0;
		while(n>0){
			fib=n1;
			n1=n2;
			n2=n1+fib;
			n--;
			System.out.print(fib);
			System.out.print(" ");
			
		}
	}

}
