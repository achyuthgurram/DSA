package algos.combinatorics;

/**
 * Given a positive integer A.
 * Return the number of ways it can be written as a sum of consecutive positive integers.
 * 1 <= A <= 109
 */
public class ConsecutiveNumbersSum {
    public static void main(String[] args)
    {
        System.out.println(new ConsecutiveNumbersSum().solve(15)); //4 [[15], [7,8], [3,4,5], [1,2,3,4,5]]
        System.out.println(new ConsecutiveNumbersSum().solve(5)); //2
    }

    public int solve(int A) {
        int result = 1; //just the number itself

        for(int i = 2; i <= (A + 1) / 2; i++)
        {
            double val = (((double)(2 * A) / i) - i - 1) / 2;
            if (val >= 0 && Math.floor(val) == val)
                result++;

            if(val < 0)
                break;
        }

        return result;
    }
}


