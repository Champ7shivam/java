package javaDsa;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int val = nums[0];
        int idx = 1;
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
                val = nums[i];
                k++;
            }
        }

        for (int ele : nums) {
            System.out.print(ele + ", ");
        }

        System.out.println();
        System.out.println(k);
    }
}
