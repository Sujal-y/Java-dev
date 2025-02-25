package src.leatcode;

import java.util.Arrays;

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.
//
//Consider the number of elements in nums which are not equal to val be k, to get accepted,
// you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
// The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int nonval=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                nums[i] = 101;
            }
            else{
                nonval++;
            }
        }
        Arrays.sort(nums);
        return nonval;
    }
    static void display(int[] array){

        for (int j : array) {
            System.out.printf("%d ", j);
        }
    }
    public static void main(String[] args){
        int[] a = {0,1,2,2,3,0,4,2};
        int vala=2;
        System.out.println(removeElement(a,vala));
        display(a);
    }
}
