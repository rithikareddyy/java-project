package maps;

import java.util.HashMap;

public class Sum{

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        // If no such pair is found
        return new int[]{-1, -1};
    }
}

