package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Three3SumSubmition {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3){
            return lists;
        }
        int support =1,checkj =1, j = 1, k = 2, length = nums.length;
        for (int i = 0; i < length; k += 1) {
            if ((i != j && i != k && j != k) && (nums[i] + nums[j] + nums[k] == 0)) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                list.sort(Comparator.naturalOrder());
                if (!lists.contains(list)) {
                    lists.add(list);
                }
            }
            if (k == (length - 1)) {
                checkj++;
                j++;
                support = support +1;
                k = support;
            }
            if (checkj == (length-1) ){
                i++;
                j=i+1;
                k=j;
                support=k;
                checkj =j;
            }
            if (i == length - 2) {
                break;
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        Three3SumSubmition three3Sum = new Three3SumSubmition();
        List<List<Integer>> lists = three3Sum.threeSum(nums);
        System.out.println(lists);
    }
}
