
import java.util.HashMap;


public class Arrays_solution {
    public static void main(String[]args) {
        /*
        @author Shakil

         */

      // isUnique
       System.out.println(isUnique("avocado"));

       //  twoSum
        int[] numbs = {3,2,4}; int target = 9;
        twoSum(numbs,target);
        int [] num ={1,2,3,4};

        // contain duplicate
        System.out.println(containsDuplicate(num));


        // Best Time to Buy and Sell Stock
        int[] arr ={7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));


    }


    /*
       1.1  Is unique: Implement an algorithm to determine if a string has all unique characters.
             what if you cant use additional data structure?
      */
    static boolean isUnique(String text){
        boolean [] charArray = new boolean[128];
        for(int i=0;i<text.length();i++){
            int val = text.charAt(i);
            if(charArray[val]){
                return false;
            }
            charArray[val]=true;
        }
        return true;
    }
    /*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

     */

   static int [] twoSum(int [] nums ,int target){
       HashMap<Integer, Integer> seen = new HashMap<>();
       int[] res = new int[2];

       for (int i = 0; i < nums.length; i++) {
           if (seen.containsKey(target - nums[i])) {
               res[0] = seen.get(target - nums[i]);
               res[1] = i;
               break;
           }
           seen.put(nums[i], i);
       }
       return res;
    }

    /*
Contains Duplicate
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */

    static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else {
                map.put(nums[i],1);
            }

        }
        return false;

    }

    /*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

     */

    static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int min = prices[0];

        for(int i=1; i< prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int dif = prices[i]-min;
            if(dif>maxProfit){
                maxProfit = dif;

            }

        }
        return maxProfit;

    }

}


