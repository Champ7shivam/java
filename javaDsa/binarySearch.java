package javaDsa;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 4, 5, 9, 12 };
        int target = -1;

        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                st = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println(ans);
    }
}
