package com.basic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapSorting {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.put(2, 4);
		map.put(3, 3);
		map.put(4, 1);
		Set<Integer> sets=new HashSet<>();
		Map<Integer, Integer> out=new LinkedHashMap<Integer,Integer>();
		
		Set<Integer> keys=map.keySet();
		for(Integer key:keys){
			sets.add(map.get(key));
		}
		for(Integer set:sets){
		for(Map.Entry<Integer, Integer> Entry:map.entrySet()){
			if(set.equals(Entry.getValue())){
				out.put(Entry.getKey(), set);
			}
		}
		}
		
		System.out.println(out);
		
		
		
		
		
		
	}
}
