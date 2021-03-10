package easyProblems;

public class InsertionPosition {
	public int searchInsert(int[] nums, int target) {
		int position = 0;
		if (nums.length == 0 || nums == null || target == 0)
			return position;
		else if (target <= nums[nums.length - 1]) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					return i;
				} else if (nums[i] < target && nums[i + 1] > target) {
					return i + 1;
				}
			}
		} else {

			if (target > nums[nums.length - 1])
				return nums.length;
		}
		return position;
	}

	public static void main(String args[]) {
		int nums[] = { 1, 3 };
		//System.out.println(nums[nums.length-1]);
		int target = 3;
		InsertionPosition i1 = new InsertionPosition();
		System.out.println(i1.searchInsert(nums, target));
	}
}
