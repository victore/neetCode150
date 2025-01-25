import java.util.Arrays;

public class productOfElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(getProductOfElements(nums)));
    }

    public static int[] getProductOfElements(int[] nums) {
        int product = 1;
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    product *= nums[j];
                }
            }
            answer[i] = product;
            product = 1;
        }
        return answer;
    }
}