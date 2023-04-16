public class Lecture5Exercises {

    public static void main(String[] args) {
        long a=Math.round((double) 20/3);
        long b=Math.round((double)(20-a)/2);
        long c=20-a-b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public  String weakPassword(int length) {
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public  String strongPassword(int length) throws Exception {
        if(length<=2){
            throw new Exception();
        }

        long a=Math.round((double) length/3);
        long b=Math.round((double)(length-a)/2);
        long c=length-a-b;


        String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";


        String numericString="0123456789";
        String specialString="~=+%^*/()[]{}/!@#$?|";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < a; i++) {

            int index
                    = (int)(alphaString.length()
                    * Math.random());

            sb.append(alphaString
                    .charAt(index));
        }
        for (int i = 0; i < b; i++) {

            int index
                    = (int)(numericString.length()
                    * Math.random());

            sb.append(numericString
                    .charAt(index));
        }
        for (int i = 0; i < c; i++) {

            int index
                    = (int)(specialString.length()
                    * Math.random());

            sb.append(specialString
                    .charAt(index));
        }
        return sb.toString();

    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public static boolean isFiboBin(int n) {
        long fib=fibonacci(n);
        String binStr = Long.toBinaryString(n);
        int count=0;
        for (int i = 0; i < binStr.length(); i++) {
            if(binStr.charAt(i)=='1'){
                count++;
            }
        }
        if(n==fib+count){
            return true;
        }else {
            return false;
        }
    }

    public static   long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

}
