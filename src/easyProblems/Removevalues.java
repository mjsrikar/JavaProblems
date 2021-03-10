package easyProblems;

public class Removevalues {
	public int removeElement(int[] nums, int val) {
		int index = 0;
		if (nums == null || nums.length == 0)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index = index + 1;
			}
		}
		return index;
	}

	public static void main(String args[]) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int[] nums1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val1 = 2;
		int val = 2;
		Removevalues r1 = new Removevalues();
		System.out.println(r1.removeElement(nums, val));
		// System.out.println(r1.removeElement(nums1, val1));
	}
}
