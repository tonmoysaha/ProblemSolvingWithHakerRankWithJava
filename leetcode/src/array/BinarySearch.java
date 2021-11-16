package array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int r = nums.length -1, l = 0;
        int i = binaryRecursive(nums, target, l, r);
        return i;
    }

    private static int binaryRecursive(int[] nums, int target, int l, int r) {
        int mid =0;
        if (l <= r) {
            mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                return binaryRecursive(nums, target, l, mid - 1);
            }
            if (target > nums[mid]) {
                return binaryRecursive(nums, target, mid + 1, r);
            }
        }
        return -1;
    }
}
