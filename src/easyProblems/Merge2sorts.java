package easyProblems;

public class Merge2sorts {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	     int[] nums=new int[m+n];
	      for(int i=0;i<nums1.length;i++) {
	    	  if(nums1[i]<nums2[i]) {
	    		  nums[i]=nums1[i];
	    	  }
	      }
	    }
	 
}


//{1,2,3,0,0,0}
//{2,5,6}
//0