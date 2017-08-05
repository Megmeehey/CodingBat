public class Recursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        return groupSum(start + 1, nums, target - nums[start])
                || groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target - nums[start])
                || groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        return groupNoAdj(start + 2, nums, target - nums[start])
                || groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            if (start < nums.length - 1 && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        return groupSum5(start + 1, nums, target - nums[start])
                || groupSum5(start + 1, nums, target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        int sum = nums[start];
        int count = 1;
        // that one loop, that we use to find the extent
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] == nums[start]) {
                sum += nums[i];
                count++;
            }
        }
        return groupSumClump(start + count, nums, target - sum)
                || groupSumClump(start + count, nums, target);
    }

    public boolean splitArray(int[] nums) {
        // Not enough arguments, so i used another method
        return sArray(nums, 0, 0, 0);
    }

    private boolean sArray(int[] nums, int start, int sum1, int sum2) {
        if (start >= nums.length) {
            return sum1 == sum2;
        }
        return sArray(nums, start + 1, sum1 + nums[start], sum2)
                || sArray(nums, start + 1, sum1, sum2 + nums[start]);
    }

    public boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum1 % 2 == 1
                    && sum2 % 10 == 0);
        }
        return helper(start + 1, nums, sum1 + nums[start], sum2)
                || helper(start + 1, nums, sum1, sum2 + nums[start]);
    }

    public boolean split53(int[] nums) {
        return s53(0, nums, 0, 0);
    }

    private boolean s53(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return sum1 == sum2;
        }
        if (nums[start] % 5 == 0) {
            return s53(start + 1, nums, sum1 + nums[start], sum2);
        }
        // fizzbuzz
        if (nums[start] % 3 == 0) {
            return s53(start + 1, nums, sum1, sum2 + nums[start]);
        }

        return s53(start + 1, nums, sum1 + nums[start], sum2)
                || s53(start + 1, nums, sum1, sum2 + nums[start]);
    }
}
