package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
1. Iterate over the loop
2. For each pair of elements store the target in hashset
3. That is Store -(A+B) in hashset for each pair
4. If the target exists , add the elements to the inner List
5. O(n^2 complexity)
6. This solution works only for distinct elements
 */

public class ThreeSum {

    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> outputList = new ArrayList<>();

        for (int i = 0; i < input.length - 1; i++) {

            HashSet<Integer> map = new HashSet<>();

            for (int j = i+ 1; j < input.length ; j++) {
                List<Integer> innerOutput = new ArrayList<>();
                int target = -(input[i]+input[j]);
                if (map.contains(target)) {
                    innerOutput.add(target);
                    innerOutput.add(input[i]);
                    innerOutput.add(input[j]);
                    outputList.add(innerOutput);
                    System.out.println(outputList);
                } else {
                    map.add(input[j]);
                }

            }
        }
    }
}

