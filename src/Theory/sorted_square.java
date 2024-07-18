package Theory;

public class sorted_square {

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        arr = sortedSquares(arr);
        sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

    public static void sort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
