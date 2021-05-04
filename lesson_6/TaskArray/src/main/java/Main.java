import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        task2();

        task1();



   }
    public static void task1(){
        int[] arr = {1, 2, 3, 5, 4, 5, 7, 10};
        MethodsForArray.returnArray(arr);
        System.out.println(Arrays.toString(MethodsForArray.returnArray(arr)) + "\n");

        int[] arr1 = {1, 2, 3, 4, 5, 6, 4};
        MethodsForArray.returnArray(arr1);
        System.out.println(Arrays.toString(MethodsForArray.returnArray(arr1)) + "\n");

        int[] arr2 = {1, 2, 44, 3};
        MethodsForArray.returnArray(arr2);
        System.out.println(Arrays.toString(MethodsForArray.returnArray(arr2)) + "\n");
    }

    public static void task2() {
        int[] arr3 = {1, 1, 1, 4, 4, 1, 4, 4};
        MethodsForArray.checkArrayOf1and4(arr3);
        System.out.println(MethodsForArray.checkArrayOf1and4(arr3) + "\n");

        int[] arr4 = {1, 1, 1, 1, 1, 1, 1, 1};
        MethodsForArray.checkArrayOf1and4(arr4);
        System.out.println(MethodsForArray.checkArrayOf1and4(arr4) + "\n");

        int[] arr5 = {4, 4, 4, 4, 4, 4, 4, 4};
        MethodsForArray.checkArrayOf1and4(arr5);
        System.out.println(MethodsForArray.checkArrayOf1and4(arr5) + "\n");

        int[] arr6 = {1, 4, 1, 4, 3, 1, 4, 4};
        MethodsForArray.checkArrayOf1and4(arr6);
        System.out.println(MethodsForArray.checkArrayOf1and4(arr6) + "\n");
    }



}
