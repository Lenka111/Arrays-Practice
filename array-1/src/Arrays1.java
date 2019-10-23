// Elena Voinu
public class Arrays1 {
    public static void main(String args[]) {

        //array initiation
        int[] nums  = {2, 3, 5, 6, 7};

        //method call
        System.out.println(firstLast(nums));
    }

    private static boolean firstLast(int[] nums) {
        // check if number 3 is the first element in the array
        // or number 7 is the last element in the array and return true or false
        return nums[0] == 3 || nums[nums.length - 1] == 7;

    }
}
