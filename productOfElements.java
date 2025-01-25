import java.util.Arrays;

public class productOfElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(getProductOfElements(nums)));
    }

    public static int[] getProductOfElements(int[] nums) {
        int product = 1;
        int[] answer = new int[nums.length];
        
        // This is a brute force solution, but it works
        /* 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    product *= nums[j];
                }
            }
            answer[i] = product;
            product = 1;
        }
        */
        // This is a more efficient solution
        Arrays.fill(answer, 1);
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i] * prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i] * suffix;
        }

        return answer;
    }
}