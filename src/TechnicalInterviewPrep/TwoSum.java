package TechnicalInterviewPrep;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        //initial loop
        for (int i = 0; i < nums.length; i++) {
            //nested loop to compare index and the index before it
            for (int j = i + 1; j < nums.length; j++) {
                //simple math to see if two indices equal target
                if (nums[j] == target - nums[i]) {
                    //create new array with the two correct indices
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
