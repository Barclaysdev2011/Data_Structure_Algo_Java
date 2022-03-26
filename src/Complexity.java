public class Complexity {
    public static void main(String [] args){

    }


    /*
     the below code is printing all the pairs (two element sequences).
     there are O(N^2) pairs. therefore, the runtime is O(N^2).
    */
    public static void method1(int [] n){
        int counter=0;
        for(int i=0; i< n.length;i++){
            for(int j=0; j<n.length;j++){
                System.out.println(n[i]+ " , " + n[j]);
                System.out.println("Operation "+counter); counter++;
            }
        }
    }


    /*
        the runtime of below mehtod is O(n^3)
    */

    public static void method2(int n){
        int counter=0;
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                for(int z = 0; z < n; z++) {
                    if( 3*x + 9*y + 8*z == 79 ) {
                        System.out.println("Operation "+counter); counter++;
                    }
                }
            }
        }
    }

    /*
        the runtime of below mehtod is O(log n)
    */
    public static void method3(int n){
       int sum =0;
       int counter=0;
       while (n > 0){
           sum += n %10;
           n /=10;
           System.out.println("Operation "+counter); counter++;
       }
       System.out.println(sum);
    }


    /*
       the runtime of below mehtod is O(nlogn)
   */
    public static void method4(int [] n){
        int inputLength = n.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = n[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = n[i];

        }

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                n[k] = leftHalf[i];
                i++;
            }
            else {
                n[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            n[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            n[k] = rightHalf[j];
            j++;
            k++;
        }
        System.out.println("Operation i "+i);
        System.out.println("Operation  j "+j);
    }

/*
 the runtime of below mehtod is O(loglogn)
 */
    public static void method5(int n){
        boolean[] nonPrime = new boolean[n];
        nonPrime[1] = true;
        int numNonPrimes = 1;
        for (int i=2; i < n; i++) { // O(n)
            if (nonPrime[i]) continue;
            int j = i * 2;
            while (j < n) { // O(log(log(n)))
                if (!nonPrime[j]) {
                    nonPrime[j] = true;
                    numNonPrimes++;
                }
                j += i;

                System.out.println("Operation i "+i);
                System.out.println("Operation  j "+j);
            }
    }
    }


    /*
        There are 2 branches per call, and we go as deep as N, therefore the runtime is O(2^N)
     */

    public  static  int  method6(int  n){
        if(n <= 0){
            return 0;
        }else if (n==1){
            return 1;
        }
        return method6(n-1) + method6(n-2);
    }
}
