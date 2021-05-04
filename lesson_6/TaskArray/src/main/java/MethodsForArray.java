import java.util.Arrays;

public class MethodsForArray {


    public static int[] returnArray(int[] arr) {
        if (arr.length == 0) {
            throw new NullPointerException();
        }
        int indexOfLast4 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) indexOfLast4 = i + 1;
        }
        if (indexOfLast4 == -1) throw new RuntimeException();
        else return Arrays.copyOfRange(arr, indexOfLast4, arr.length);
    }


    public static boolean checkArrayOf1and4(int... arr){
        boolean i1 = false, i4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                i1 = true;
            } else if (arr[i] == 4) {
                i4 = true;
            } else {
                return false;
            }
        }
        return i1 && i4;
    }



}
