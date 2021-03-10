package easyProblems;

public class RemoveDuplicates {
public int removeDuplicates(int[] nums) {
        int index=1;
        if(nums.length==0 || nums== null) return 0;
      
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]!=nums[i+1]) {
        		nums[index]=nums[i];
        		index=index+1;
        	}
        }
 
        return index;	}
public static void main(String args[]) {
	int[] nums = {1,1,2};
	int[] nums1= {0,0,1,1,1,2,2,3,3,4};
	RemoveDuplicates rd= new RemoveDuplicates();
	System.out.println(rd.removeDuplicates(nums));
	System.out.println(rd.removeDuplicates(nums1));
}
}
