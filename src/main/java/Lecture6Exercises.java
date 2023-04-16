import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {
    public static void main(String[] args) {


        int[] arr=new int[]{Integer.MAX_VALUE, 3, Integer.MAX_VALUE, -2,2,2,2};
        int [] array=new int[(int)Math.round((double) arr.length/2)];
        int count=0;
        for (int i = 0; i < arr.length; i = i+2){
            array[count]=arr[i];
            count++;
        }
        long sum = 0;
        for(int i=0; i<array.length; i++){
            //myArray[i] = s.nextInt();
            sum = sum + array[i];
        }

    }

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public static   long calculateEvenSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i = i+2){
            sum=sum+arr[i];
        }
        return sum;

    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public static int[] reverseArray(int[] arr) {
        int count=0;
        int[] intArray = new int[arr.length];
        for(int i=arr.length;i>0;i--){
            intArray[count]=arr[i-1];
            count++;
        }
        return intArray;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int row1, col1, row2, col2;


        row1 = m1.length;
        col1 = m1[0].length;
        row2 = m2.length;
        col2 = m2[0].length;

        if (col1 != row2) {
            throw new RuntimeException();
        } else {
            //Array prod will hold the result
            double prod[][] = new double[row1][col2];

            //Performs product of matrices a and b. Store the result in matrix prod
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        prod[i][j] = prod[i][j] + m1[i][k] * m2[k][j];
                    }
                }
            }
            return prod;
        }
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        List<String> stringList=null;
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < names.length; ++i) {
            stringList=new ArrayList<>();
            for(int j = 0; j < names[i].length; ++j) {
                System.out.println(names[i][j]);
                stringList.add(names[i][j]);
            }
            lists.add(stringList);
        }
        return lists;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public  List<Integer> primeFactors(int n) {
        List<Integer> integerList=new ArrayList<>();
        for(int i = 2; i<= n; i++){
            if(isPrime(i)==1){
                int x = n;
                while(x%i==0){
                    int f=i;
                    if(!integerList.stream().anyMatch(c->c==f)){
                        integerList.add(i);
                    }

                    x /= i;
                }
            }
        }
        return integerList;
    }

    public  int isPrime(int n){

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return 0;
        }

        return 1;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public  List<String> extractWord(String line) {
        List<String> stringList=new ArrayList<>();
        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++) {

            stringList.add( words[i].replaceAll("[^\\w]", ""));
        }

        return stringList;
    }
}
