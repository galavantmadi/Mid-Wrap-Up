public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public  long factorial(int n) {
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        //System.out.println(fibonacci(2));

    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public static   long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        char[] resultArray = word.toCharArray();
        String result="";
        for (int i = resultArray.length - 1; i >= 0; i--){
            result=result+resultArray[i];
        }
        return result;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public  boolean isPalindrome(String line) {
        String[] strSplit=line.split(" ");
        String strFinal="";
        for(int i=0;i<strSplit.length;i++){
            strFinal=strFinal+strSplit[i];
        }
        int len=(strFinal.length()%2)==0?(strFinal.length()/2):(strFinal.length()/2)+1;
        int j=strFinal.length();
        for (int i=0;i<len;i++){
            String first=strFinal.substring(i,i+1);
            String second="";
            if(i==0){
                second=strFinal.substring(j-1,j);
            }else {
                second=strFinal.substring(j-i-1,j-i);
            }

            if(!first.toLowerCase().equals(second.toLowerCase())){
                return false;
            }
        }
        return true;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[] str1Array=null;
        char[] str2Array=null;
        if(str1.length()>=str2.length()){
            str1Array = str1.toCharArray();
            str2Array = str2.toCharArray();
        }else {
            str1Array = str2.toCharArray();
            str2Array = str1.toCharArray();
        }

        char prod[][] = new char[str1.length()][str2.length()];



        for(int i=0;i<str2Array.length;i++){
            for (int j=0;j<str1Array.length;j++){
                if(str1Array[j]==str2Array[i]){
                    prod[i][j] ='*';
                }else {
                    prod[i][j] =' ';
                }

            }
        }

        return prod;
    }
}
