import java.util.*;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pfs = 0;
        int count = 0;
        for (int num : nums) {
            pfs += num;
            count += map.getOrDefault(pfs-k, 0);           
            map.put(pfs, map.getOrDefault(pfs, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {6, -1, 2, 1, -1};
        int k = 0;
        System.out.println(subarraySum(arr, k)); 
    }
}
