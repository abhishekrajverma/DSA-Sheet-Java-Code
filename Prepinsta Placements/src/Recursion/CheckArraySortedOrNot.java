package Recursion;

public class CheckArraySortedOrNot {
    static boolean checkSorted(int[] arr){
        if (arr.length<=1){
            return true;
        }

        if (arr[0] > arr[1]){
            return false;
        }
        //here we create a new array with size n-1
        int[] smallArr = new int[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            smallArr[i-1] = arr[i];
        }

        boolean smallArrayAns = checkSorted(smallArr);
        return smallArrayAns;

    }
    //note - this functions increase the space complexity of the code, so this is not the right way to
    //  check the array is sorted or not
    // we solve this problem in checkSortedBetter class go and see the code
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1};
        boolean ans = checkSorted(arr);
        System.out.println(ans);

    }
}
