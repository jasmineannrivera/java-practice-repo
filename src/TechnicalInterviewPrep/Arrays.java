package TechnicalInterviewPrep;//Take an array of numbers and create new sub arrays. Each sub array must equal the same value. Use all numbers only once.

public class Arrays {
    // Returns split point. If
    // not possible, then return -1.
    static int findSplitPoint(int[] arr, int n) {

        int leftSum = 0 ;

        // traverse array element
        for (int i = 0; i < n; i++)
        {
            // add current element to left Sum
            leftSum += arr[i] ;

            // find sum of rest array
            // elements (rightSum)
            int rightSum = 0 ;

            for (int j = i+1 ; j < n ; j++ )
                rightSum += arr[j] ;

            // split point index
            if (leftSum == rightSum)
                return i+1 ;
        }

        // if it is not possible to
        // split array into two parts
        return -1;
    }

    // Prints two parts after finding
    // split point using findSplitPoint()
    static void printTwoParts(int[] arr, int n)
    {

        int splitPoint = findSplitPoint(arr, n);

        if (splitPoint == -1 || splitPoint == n )
        {
            System.out.println("Not Possible");
            return;
        }

        for (int i = 0; i < n; i++)
        {
            if(splitPoint == i)
                System.out.println();

            System.out.print(arr[i] + " ");

        }
    }
}
