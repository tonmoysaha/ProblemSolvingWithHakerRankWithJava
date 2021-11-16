package array;

public class BinarySearchMyVersion {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
//        int arr[] = {12,9,5,3,0,-1};
        int target = 2;
        System.out.println(search(arr, target));;
    }

    public static int search(int[] nums, int target) {
        int mid = nums.length/2;
        int i = binaryRecursive(nums, target, mid);
        return i;
    }

    // 1 2 3 4 5 6 7 17
    private static int binaryRecursive(int[] nums, int target, int mid) {
        if(mid > nums.length-1 || mid < 0)
            return -1;
        if (target == nums[mid]) {
            return mid;
        }

        if (target < nums[mid]) {
            mid = mid-1;
            return binaryRecursive(nums, target, mid);
        }
        if (target > nums[mid]){
            mid = mid+1;
         return binaryRecursive(nums, target, mid);
        }
        return -1;
    }
}
