package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declare array
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 2;

        int[] nums2 = {5, 4, 2};

        displayIntArray(nums);
        System.out.println();
        displayIntArray(nums2);
        //sort
        Arrays.sort(nums);
        //print obj
        System.out.println(nums);
        //print array
        displayIntArray(nums);
    }

    public static void displayIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
    }
}
