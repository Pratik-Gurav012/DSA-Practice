/*
 * LeetCode 875 - Koko Eating Bananas
 *
 * Approach:
 * Use Binary Search on the possible eating speeds.
 * For each candidate speed, calculate the total hours
 * required to finish all banana piles. If the speed is
 * valid, search for a smaller valid speed; otherwise,
 * search for a larger speed.
 *
 * Time Complexity: O(n × log(maxPile))
 * Space Complexity: O(1)
 *
 * Pattern: Binary Search on Answer, Monotonic Predicate
 */

package arrays;

public class LC875_KokoEatingBananas {
    boolean isValid(int k, int h, int[] piles){
        long totalHours = 0;
        for (int pile : piles){
            totalHours += (long) (pile + k-1)/k; //It's alternative for the ceil method
        }
        if(totalHours <= h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile =0;
        int ans =0;
        for (int pile : piles){
            maxPile = Math.max(maxPile, pile);
        }

        int left =1;
        int right = maxPile;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(isValid(mid, h, piles)){
                ans = mid;
                right = mid -1;
            }
            else {
                left = mid +1;
            }
        }
        return ans;
    }
}
