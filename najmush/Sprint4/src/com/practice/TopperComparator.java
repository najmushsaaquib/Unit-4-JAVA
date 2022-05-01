package com.practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class TopperComparator implements Comparator<Map.Entry<String, TopperStudent>>{

	
	@Override
	public int compare(Entry<String, TopperStudent> o1, Entry<String, TopperStudent> o2) {
		
		TopperStudent one = o1.getValue();
		TopperStudent two = o2.getValue();
		
		return Integer.compare(one.getMark(), two.getMark());
		
		
	}

	
}
