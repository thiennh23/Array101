package Theory;

import java.util.Spliterator;

class evenNum {

    public static void main(String[] args) {
        int[] arr = new int[]{12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkEven(nums[i]))
                count++;
        }
        return count;
    }

    public static boolean checkEven(int n) {
        int count = 0;
        int x = n;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        if (count % 2 == 0)
            return true;
        else return false;
    }
}