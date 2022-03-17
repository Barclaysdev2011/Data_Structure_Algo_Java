import java.util.Arrays;

public class BinaryNumber {
    private int data [];
    private int binaryNumber;
    private boolean overflow;
    protected String letters;
    BinaryNumber(int length){
        data = new int[length];
        for(int i=0; i <length; i++){
            data[i]=0;
        }
    }
    BinaryNumber(String str){
        letters =str;
        int covertString =0;
        for(int i=0; i < str.length();i++){
            if(str.charAt(i)=='1'){
                int l = str.length()-1 -i;
                covertString +=Math.pow(2,l);

            }
        }
        int decimalValue =  covertString;
        System.out.println("decimal Value of Binary number " + decimalValue);
    }void setLetters(String l){
        letters =l;
    }
    void setBinaryNumber(int binaryNum){
        binaryNumber = binaryNum;
    }

    int getDigit(int  index){
        int getValue=0;
        try {
            if(index < 0){
                throw new Exception("Only Positive Numbers & no Letters Please!");
            }
            getValue = data[index];

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return getValue;
    }

    int  getLength(){
        int count =0;
        while (binaryNumber > 0){
            binaryNumber = binaryNumber /10;
            count++;
        }
        return count;
    }
    int  toDecimal(){
        int decimal = 0;
        int n = 0;
        while(binaryNumber >0){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                decimal += temp*Math.pow(2, n);
                binaryNumber = binaryNumber/10;
                n++;
            }
        }
        return decimal;
    }
    void shiftR(int amount){
        int a = toDecimal();
        int value = a >>> amount;
        int i = 0;

       while (value>0){
           data[i]=value%10;
           value = value/2;
           i++;
       }
        for(i = i-1;i >= 0;i--){
           System.out.print("Right shift " + data[i]);
        }

    }

    void add(String binaryNumber, String abinaryNumber) {
        StringBuilder sb = new StringBuilder();
        int  binaryNumberLen= binaryNumber.length() - 1;
        int abinaryNumberLen = abinaryNumber.length() -1;
        int carry = 0;
        if ((binaryNumber.matches(".*[a-z].*") || abinaryNumber.matches(".*[a-z].*"))) {
            System.out.println("Please enter binary number ");
        }

     else if(binaryNumberLen != abinaryNumberLen){
            System.out.println("the length of both binary number doesnt match ");
        }else {
            try{
                while (binaryNumberLen >= 0 || abinaryNumberLen >= 0) {
                    int sum = carry;
                    if (abinaryNumberLen >= 0) sum += abinaryNumber.charAt(abinaryNumberLen--) - '0';
                    if ( binaryNumberLen >= 0) sum += binaryNumber.charAt(binaryNumberLen--) - '0';
                    sb.append(sum % 2);
                    carry = sum / 2;
                }
                if(carry ==1){
                    overflow = true;
                    System.out.println("Integer overflow " + true);

                }
                if (carry != 0) sb.append(carry);
                System.out.print("Addition of binary numbers  "+ sb.reverse().toString());
                int x =Integer.parseInt(sb.reverse().toString());
                setBinaryNumber(x);
                System.out.print(" = "+ toDecimal());
                clearOverflow();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

   }
    public String toString(){
        String y ="Overflow";
       System.out.print(letters);
       String s = " ";
       /*
        for(int index = 0; index < letters.length(); index+=9) {
            String temp = letters.substring(index, index+8);
            int num = Integer.parseInt(temp,2);
            char l = (char) num;
            s = s+l;
        }

        */

        System.out.print(s); //  Happy Easter!

        return y;
    }
    public void clearOverflow(){
       overflow =false;
        System.out.println("\noverflow is " + false);
    }



    public static void main (String[] args)  {
        BinaryNumber t = new BinaryNumber(8);
        t.setBinaryNumber(1011);
        System.out.println("convert binary to decimal " + t.toDecimal());

       t.setBinaryNumber(1011);
       System.out.println("length of binary number " + t.getLength());

       t.setBinaryNumber(1011);
       t.shiftR(3);

       System.out.println();
       System.out.println("getDigit by  index number  " + t.getDigit(1));


       t.setBinaryNumber(1011110);
       System.out.println(t.toString());


       BinaryNumber str = new BinaryNumber("01001000");
       str.add("11","11");


        str.setLetters("01001000 01100001 01110000 01110000 01111001 00100000 01000101 01100001 01110011 01110100 01100101 01110010 00100001");
        str.toString();

    }


}

