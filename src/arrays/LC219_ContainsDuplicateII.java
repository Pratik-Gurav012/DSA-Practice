package arrays;

import java.util.HashSet;

class Solution{
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // [ 1,2,3,2,4,5,6] k=5
        HashSet<Integer> hashSet = new HashSet<>();

        int j =0;

        while (j< nums.length) {
            if (hashSet.contains(nums[j])) {
                return true;
            } else {
                hashSet.add(nums[j]);
            }
            if (hashSet.size() > k) {
                hashSet.remove(nums[j - k]);
            }
            j++;
        }
        return false;
    }
}

public class LC219_ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k =2;
        Solution.containsNearbyDuplicate(arr, k);
    }
}
