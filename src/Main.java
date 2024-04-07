import java.util.Arrays;

public class Main {
    /*
     * This method calculates the lowest number in array
     * it uses recursive approach
     * Time complexity: O(n) ,where n is the length of array
     * The recursion runs within array from length-1 to 0
     * resulting in linear time complexity
     *
     * @param length is length of input array, m is input array , lowest is number in array which we must compare in array
     *@return the lowest number in array
     * */
    public static int lowestNumber(int legnth,int[] m,int lowest) {
        if(legnth==0)
        {
            return lowest;
        }
        if(m[legnth]<lowest)
        {
            lowest=m[legnth];
        }
        return lowestNumber(legnth-1,m,lowest);
    }
    public static int lowestNumber()
    {
        int[] m={3,4,1,5,-12};
        return lowestNumber(m.length-1,m,0);
    }
    /*
     * This method calculates the mean of the array
     * it uses recursive approach
     * Time complexity: O(n) ,where n is the length of array
     * The recursion runs within array from length-1 to 0
     * resulting in linear time complexity
     *
     * @param currentIndex is index of the array, m is input array , sum is sum of array fo each element
     *@return the  mean of the array
     * */
    public static double getMean(int currIndex, int[] m,double sum) {
        if (currIndex == m.length) {
            return (double) sum / m.length;
        }
        return getMean(currIndex + 1,m,m[currIndex]+sum);
    }
    public static double getMean()
    {
        int[] m={3,4,5,5,35};
        return getMean(0,m,0);
    }

    /*
     * This method gives array in reverse order
     * it uses recursive approach
     * Time complexity: O(n) ,where n is the length of array
     * The recursion runs within array from length-1 to 0
     * resulting in linear time complexity
     *
     * @param currentIndex is index of the array, m is input array , sum is sum of array fo each element
     *@return the  mean of the array
     * */
    public static void Reverse(int[] m, int length, int curr) {
        if (length >= (m.length - 1) / 2) {
            return;
        }
        int temp = m[length];
        m[length] = m[m.length - 1 - length];
        m[m.length - 1 - length] = temp;
        Reverse(m, length + 1, curr);
    }
    public static void Reverse(int[] m)
    {
        Reverse(m,0,0);
    }
    /*
     * This method calculates the factorial
     * it uses recursive approach
     * Time complexity: O(n) ,where n is represents the input parameter
     * The recursion runs within array from n to 1
     * resulting in linear time complexity
     * @param the number , which we must calculate factorial
     *@return return factorial of n
     * */
    public static int Factorial(int n)
    {
        if(n==0)
        {
            return  1;
        }
        return n*Factorial(n-1);
    }
    public static int Factorial()
    {
        return Factorial(5);
    }
    /*
     * This method calculates the power of a number using recursive approach.
     * Time complexity: O(т), where degree represents the input parameter.
     * The recursion runs within the range from degree to 1, resulting in linear time complexity.
     *
     * @param num the base number
     * @param degree the degree of the power
     * @return the result of raising num to the power of degree
     */
    public static int getPower(int num,int degree)
    {
        if(degree==0)
        {
            return 1;
        }
        return num*getPower(num,degree-1);
    }

    public static int getPower()
    {
        return getPower(2,10);
    }
    /**
     * This method calculates the nth Fibonacci number using a recursive approach.
     * Time complexity: O(2^n), where n represents the input parameter.
     * The recursion explores the Fibonacci sequence up to the nth number,
     * resulting in exponential time complexity.
     *
     * @param n the index of the Fibonacci number to be calculated
     * @return the nth Fibonacci number
     */
    public static int Fibonachi(int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        return  Fibonachi(n-1)+Fibonachi(n-2);
    }
    public static int Fibonachi()
    {
        return Fibonachi(17);
    }
    public static void main(String[] args) {
        double startTime=System.nanoTime();
        int result=Fibonachi();
        double endTime =System.nanoTime();
        double duration =(endTime-startTime)/1000000;
        System.out.println("at 17 fibonachi  is "+result);
        System.out.println("Duration "+duration);
    }
}