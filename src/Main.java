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

    public static void main(String[] args) {
        double startTime=System.nanoTime();
        double result =lowestNumber();
        double endTime =System.nanoTime();
        double duration =(endTime-startTime)/1000000;
        System.out.println("Lowest number "+result);
        System.out.println("Duration "+duration);
    }
}