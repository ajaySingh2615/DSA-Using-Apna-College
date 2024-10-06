public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 5};

        int largest = largestNumberAlgo(nums);
        System.out.printf("The largest number is : %d", largest);
    }

    public static int largestNumberAlgo(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
