import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            arr2[(arr.length - 1) - i] = arr[i];
        }
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int index = 0;
        for (int i = arr.length - 2; i >= 0; i--){
            if (arr[arr.length - 1] > arr[i]){
                index = i;
                break;
            }
        }
        return arr[index];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] factor = new double[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++){
            factor[i] = Double.valueOf(arr[i+1])/Double.valueOf(arr[i]);
        }
        int count = 0;
        for (int i = 1; i < factor.length; i++){
            if (factor[i] == factor[i-1]){
                count += 1;
            }
        }
        if (count == factor.length - 1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        System.out.println(Arrays.toString(reverse(arr1)));
        int[] arr2 = {42,5,73};
        System.out.println(secondLargest(arr2));
        int[] arr3 = {1,2,4,8,16,33};
        System.out.println(isGeometric(arr3));
    }
}
