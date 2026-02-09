package javaDsa;

import java.util.Arrays;

// method 01 --- (brute force)
public class majorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 3, 4, 5, 3 };
        int n = nums.length;
        int ans = 0;
        for (int val : nums) {
            int count = 0;
            for (int ele : nums) {
                if (val == ele) {
                    count++;
                }
            }
            if (count > n / 2) {
                ans = val;
            }
        }

        System.out.println(ans);
    }
}

// method 02 -- (optimized approach - using sorting)
class majorityElement2 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 3, 4, 5, 3 };

        Arrays.sort(nums);
        int count = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > nums.length / 2) {
                ans = nums[i];

            }
        }
        System.out.println(ans);
    }
}

// method 03 -- (moore's voting algorithm)
class majorityElement3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 3, 4, 5, 3 };
        int count = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                ans = nums[i];
            if (ans == nums[i])
                count++;
            else
                count--;
        }
        System.out.println(ans);
    }
}