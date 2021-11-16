package array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] sumPair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sumPair[0] = i;
                    sumPair[1] = j;
                    break;
                }
            }
        }
        return sumPair;

    }

    public static void main (String[]args){
        int[] nums = {3,2,3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(nums, target);
        System.out.println("[" + ints[0] +","+ ints[1]+"]");
    }
}
