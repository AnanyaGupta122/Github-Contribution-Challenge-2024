package Samples.Java.Advanced_ChatGPT;

/*
Program: Binary Search
Aim: Implement binary search algorithm to find the index of a target element in a sorted array of integers.
*/
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

