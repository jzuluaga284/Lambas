package CodeEntreview.maxSubArraySum;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxArry(nums));
    }

    private static int maxArry(int[] nums) {

        int maxEndingHere = nums[0];
        int maxsoFar = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxsoFar = Math.max(maxsoFar, maxEndingHere);
        }
        return maxsoFar;
    }
}
