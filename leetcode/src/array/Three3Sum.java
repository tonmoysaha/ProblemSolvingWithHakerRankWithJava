package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Three3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3){
            return lists;
        }
        int j = 1, k = 2, length = nums.length;
        for (int i = 0; i < length - 1; j += 1, k += 1) {
            if ((i != j && i != k && j != k) && (nums[i] + nums[j] + nums[k] == 0)) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                if (!lists.contains(list.stream().sorted().collect(Collectors.toList()))) {
                    lists.add(list);
                }
            }
            if (j == (length - 2)) {
                i++;
                j = i;
                k = i + 1;
            }
            if (i == length - 2) {
                break;
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Three3Sum three3Sum = new Three3Sum();
        List<List<Integer>> lists = three3Sum.threeSum(nums);
        System.out.println(lists);
    }
}
