import java.util.*;

public class DifferenceTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(int n : set1){
            if(!set2.contains(n)){
                ans.get(0).add(n);
            }
        }
        for(int n : set2){
            if(!set1.contains(n)){
                ans.get(1).add(n);
            }
        }
        return ans;
    }
}