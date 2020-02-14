package com.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;

public class Reverse {
	public static void main(String[] args) {
		int ia=1234;
		String sx=""+ia;
		StringBuffer sb=new StringBuffer(sx);
		sb.reverse();
		System.out.println(Integer.valueOf(sb.toString()));
		
		
		/*Occurrences of each character in String*/
		String s="Good Looking";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		HashMap<Character, Integer> count=new HashMap<Character,Integer>();
		for(char c:arr){
			if(count.containsKey(c)){
				count.put(c, count.get(c)+1);
			}else{
				count.put(c, 1);
			}
		}
		System.out.println(s+" : "+count);
		
		/* Find the largest number in an input*/
		int n=1238975;
		int large=0;
		int reminder;
		while(n>0){
			reminder=n%10;
			n=n/10;
			if(reminder>large){
				large=reminder;
			}
			
		}
		System.out.println(large);
		
		int num=1235,out=0,remind;
		while(num>0){
			remind=num%10;
			out=(out*10)+remind;
			num=num/10;
			
		}
		System.out.println(out);
		
		int value=16845;
		String ss=""+value;
		char[] arr1=ss.toCharArray();
		Arrays.sort(arr1);
		String op="";
		for(int i=0;i<arr1.length;i++){
			op=op+arr1[i];
		}
		System.out.println(Integer.parseInt(op));
		
		double dec=123456.4588;
			
		BigDecimal bd=new BigDecimal((dec-Math.floor(dec))*10000);
		bd=bd.setScale(4,RoundingMode.HALF_EVEN);
		System.out.println(bd.intValue());
	}
}
