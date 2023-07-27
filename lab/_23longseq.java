package lab;
import java.util.HashSet;

public class _23longseq  {
    public static int findLongestConsecutiveSequenceLength(int[] nums) {
        // Create a hash set to store all elements of the array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Iterate through the array and check for each number if it is the start of a sequence
        for (int num : nums) {
            // If the current number is the start of a sequence, check the length of the sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Keep incrementing the current number and updating the length of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maximum length if needed
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49,3, 6, 2, 4, 7, 5};
        int longestSequenceLength = findLongestConsecutiveSequenceLength(nums);
        System.out.println("The length of the longest consecutive elements sequence is: " + longestSequenceLength);
    }
}
