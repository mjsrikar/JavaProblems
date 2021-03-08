package easyProblems;

import java.util.HashMap;

public class TwoSums {
public int[] twosums(int[] ar,int target) {
    HashMap<Integer,Integer> hm= new HashMap<>();
    for(int i=0;i<ar.length;i++) {
    	int comp=target-ar[i];
    	if(hm.containsKey(comp)) {
    		return new int[] {hm.get(comp),i};
    	}else 
    		hm.put(ar[i], i);
    }
	return new int[] {};	
}
public static void main(String args[]) {
	int[] ar= {1,3,2,4,5,7,10};
	int target=15;
	TwoSums ts= new TwoSums();
	int[] op=ts.twosums(ar, target);
	for(int i=0;i<op.length;i++) {
		System.out.println(op[i]);
	}
}
}
