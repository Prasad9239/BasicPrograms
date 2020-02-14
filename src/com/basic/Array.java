package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array {
	public static void main(String[] args) {
		String[] array={"abc","ab2","123"};
		for(int i=0;i<array.length;i++){
			Pattern p=Pattern.compile("^\\d+$");
			Matcher matcher=p.matcher(array[i]);
			if(matcher.find()){
				System.out.println(array[i]);
			}
		}
	}

}
