package array;

public class TwoSumNoBootForce {

    public int[] twoSum(int[] nums, int target) {
        int j = 1;
        int length =nums.length;
        for (int i = 0; i < length-1; j +=1) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
                if (j == (length -1)){
                    i++;
                    j=i;
                }
                if (i == length-1){
                    break;
                }
            }
        return new int[]{};
    }

    public static void main (String[]args){
        int[] nums = {2,3,5,5,11};
        int target = 10;
        TwoSumNoBootForce twoSum = new TwoSumNoBootForce();
        int[] ints = twoSum.twoSum(nums, target);
        System.out.println("[" + ints[0] +","+ ints[1]+"]");
    }
}
