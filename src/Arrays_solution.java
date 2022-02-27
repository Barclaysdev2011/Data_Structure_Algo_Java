
import java.util.HashMap;


public class Arrays_solution {
    public static void main(String[]args) {
        /*
        @author Shakil

         */

      System.out.println(isUnique("avocado"));

        int[] numbs = {3,2,4}; int target = 9;
        twoSum(numbs,target);


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

}
