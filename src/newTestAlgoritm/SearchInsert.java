package newTestAlgoritm;

public class SearchInsert {
    public static void main(String[] args) {

    }
    // Поиск места для индекса
    static int searchgInsert(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length-1;

        while(lowIndex < highIndex) {
            int midlIndex = (lowIndex + highIndex) / 2;

            if(nums[midlIndex] == target) {
                return midlIndex;
            }

            if(nums[midlIndex] < target) {
                lowIndex = midlIndex + 1;
            }

            if(nums[midlIndex] > target) {
                highIndex = midlIndex - 1;
            }
        }
        return nums[lowIndex] >= target ? lowIndex : lowIndex+1;
    }
}
