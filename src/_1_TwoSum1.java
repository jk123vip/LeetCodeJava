import java.util.*;

/**
 * 
 * @author jk
 * 
 * HashMap方法，速度更快
 */

public class _1_TwoSum1 {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<Integer, Integer>();
        
        int[] result = new int[2];
        for (int i =  0; i < nums.length; i++) {
            hs.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (hs.containsKey(val)) {
                int subVal = hs.get(val);
                if (i != subVal) {
                    result[0] = i;
                    result[1] = hs.get(val);
                    return result;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
