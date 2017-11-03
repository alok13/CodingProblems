import java.util.HashMap;

public class SumTwoNumber {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + "    " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];

		HashMap<Integer, Integer> setNumber = new HashMap<Integer, Integer>();
		setNumber.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			if (setNumber.containsKey(target - nums[i])) {
				result[0] = setNumber.get(target - nums[i]);
				result[1] = i;
				return result;
			} else {
				setNumber.put(nums[i], i);
			}
		}
		return result;
	}

}