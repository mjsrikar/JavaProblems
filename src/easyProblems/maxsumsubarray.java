package easyProblems;

public class maxsumsubarray {
	public int maxSubArray(int[] nums) {
        int max_sum= nums[0];
        int current_sum= max_sum;
        for(int i=1;i<nums.length;i++){
            current_sum=Math.max(nums[i]+current_sum,nums[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
	public static void main(String args[]) {
		int[] nums= {5,4,-1,7,8};
		maxsumsubarray m= new maxsumsubarray();
		System.out.println(m.maxSubArray(nums));
	}
}
