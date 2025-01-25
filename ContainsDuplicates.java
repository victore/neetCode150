import java.util.HashSet;

public class ContainsDuplicates {
  public static void main(String[] args) {
    int[] nums = {2,4,1,5,22};

    boolean result = containsDuplicate(nums);
    System.out.println(result);
  }

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> seenNumbers = new HashSet<>();

    for (int num : nums) {
      if (seenNumbers.contains(num)) {
        return true; // Duplicate found
      }
      seenNumbers.add(num); // Add element to the HashSet
    }
    return false;
  }
}
