/*
 * LeetCode 1011 - Capacity To Ship Packages Within D Days
 *
 * Approach:
 * Use Binary Search on the possible ship capacities.
 * For each capacity, simulate the shipping process and
 * count the number of days required. If all packages can
 * be shipped within the given days, search for a smaller
 * valid capacity; otherwise search for a larger one.
 *
 * Time Complexity: O(n × log(totalWeight))
 * Space Complexity: O(1)
 *
 * Pattern: Binary Search on Answer, Monotonic Predicate, Simulation
 */

package arrays;

public class LC1011_CapacityToShipPackagesWithin_D_Days {
    boolean isValid(int capacity, int days, int[] weights){
        int usedDays =1;
        int currentLoad =0;
        for (int weight :weights){
            if(usedDays > days){
                return false;
            }
            currentLoad += weight;

            if(currentLoad > capacity){
                usedDays++;
                currentLoad = weight;
            }
        }
        return usedDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;

        for (int weight : weights){
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }

        int left = maxWeight;
        int right = totalWeight;

        while(left <= right){
            int mid = left + (right - left)/2;

            if (isValid(mid, days, weights)){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return left;
    }
}
