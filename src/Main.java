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
    public static void main(String[] args) {
        double startTime=System.nanoTime();
        int[] m={7,6,5,4,3,2,1,2};
        Reverse(m);
        double endTime =System.nanoTime();
        double duration =(endTime-startTime)/1000000;
        Arrays.stream(m).forEach(System.out::println);
        System.out.println("Duration "+duration);
    }
}