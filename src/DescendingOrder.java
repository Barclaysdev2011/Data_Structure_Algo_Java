import java.util.Scanner;

public class DescendingOrder {

    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        int i,j,temp=0;
        for(i=0;i<numbers.length;i++){
            j=i;

            while (j>0 && numbers[j] > numbers[j-1]){
                temp = numbers[j];
                numbers[j]=numbers[j-1];
                numbers[j-1]=temp;
                --j;

            }

        }



  for(i=0;i<numbers.length;i++){
                if(numbers[i] != 0){
                    System.out.print(numbers[i] + " ");
                }
            }
        System.out.println();





    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input, i = 0;
        int numElements = 0;
        int [] numbers = new int[10];

        while(i < 10){
            input = scnr.nextInt();
            if(input < 0){
                break;
            }
            numbers[i]=input;
            numElements++;
            i++;
        }
        selectionSortDescendTrace(numbers,numElements);


    }
}
