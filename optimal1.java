import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;

        // HashMap decation
        // hashmap stores  HashMap<PrefixSum, Index>
        HashMap<Integer, Integer> map = new HashMap<>();

        int length = 0;
        int maxlength = 0;

        int perfixSum = 0;

        int startIndex = 0;
        int endIndex = 0;

        int remaining = 0;
        int remainingIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            perfixSum = perfixSum + arr[i];

            // case 1

            if (perfixSum == k) {

                length = i + 1;

                if (length > maxlength) {

                    maxlength = length;
                    startIndex = 0;
                    endIndex = i;
                }
            }

            // Calculate the remaining prefix sum to search
            remaining = perfixSum - k;
            if (map.containsKey(remaining)) {

                // Get the previous value
                remainingIndex = map.get(remaining);
                // Calculate current subarray length
                length = i - remainingIndex;

                // Update the answer if this subarray is longer
                if (length > maxlength) {

                    maxlength = length;
                    startIndex = remainingIndex + 1;
                    endIndex = i;

                }

                // store the value in hashmap
                if (!map.containsKey(perfixSum)) {

                    map.put(perfixSum, i);

                    // perfixSum  is the key
                    // i which is the index is the value
                }


            }


        }
    }
}
/*
-----------------------------------------
Optimal Approach (Prefix Sum + HashMap)
-----------------------------------------

TC : O(n)

SC : O(n)

Works for:
✔ Positive numbers
✔ Negative numbers
✔ Zero
✔ Mixed arrays (Positive + Negative + Zero)

HashMap stores:
Key   -> Prefix Sum
Value -> First occurrence index
*/
