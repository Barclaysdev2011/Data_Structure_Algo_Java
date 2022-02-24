public class Arrays_solution {
    public static void main(String[]args){
        /*
        @author Shakil

         */

        System.out.println(isUnique("avocado"));
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
}
