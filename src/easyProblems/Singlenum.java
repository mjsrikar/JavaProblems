package easyProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Singlenum {
public int singleNumber(int[] nums) {
     int counter=1;
	if (nums.length==1) return counter;
	HashMap<Integer,Integer> h1= new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		if(h1.containsKey(nums[i])) {
		counter++;
		}else h1.put(nums[i], counter);
	}
return counter;	
}
/*
 * public int singleNumber(int[] nums) { HashMap<Integer,Integer> h1= new
 * HashMap<>(); for(int i=0;i<nums.length;i++) { if(h1.containsKey(nums[i])) {
 * h1.put(nums[i],h1.get(nums[i])+1);; }else h1.put(nums[i], 1); }
 * for(Map.Entry<Integer,Integer> entry: h1.entrySet()){ int k= entry.getKey();
 * int v= entry.getValue(); if(v==1){ return k; } } return-1; }}
 */

public static void main(String args[]) {
	
}
}
