package com.kong;

import java.util.HashMap;
import java.util.Map;

public class Sum_1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> stage = new HashMap<>();
		int index = 0;
		for (int i : nums) {
			int expect = target - i;
			if (stage.containsKey(expect)) {
				result[0] = index;
				result[1] = stage.get(expect);
				break;
			}
			stage.put(Integer.valueOf(i), index);

			index++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { -3, 4, 3, 90 };
		int target = 0;
		Sum_1 sum = new Sum_1();
		int[] result = sum.twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
