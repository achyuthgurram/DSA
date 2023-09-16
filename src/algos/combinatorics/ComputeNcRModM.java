package algos.combinatorics;

import java.util.Arrays;

/**
 * Compute nCr % m
 * where m is not a prime number
 */
public class ComputeNcRModM {
    public static void main(String[] args)
    {
        //A = n B = r C = m
        System.out.println(new ComputeNcRModM().solve(5, 2, 13)); //10
        System.out.println(new ComputeNcRModM().solve(6,2, 13)); //2
    }

    public int solve(int A, int B, int C) {
        int[][] array = new int[A + 1][B + 1];

        Arrays.fill(array[0], 0);
        for(int i = 0; i < array.length; i++)
        {
            array[i][0] = 1;
        }
        for(int i = 1; i <= A; i++)
        {
            for(int j = 1; j <= B; j++)
            {
                array[i][j] = (array[i - 1][j - 1] + array[i - 1][j]) % C;
            }
        }

        return array[A][B];
    }
}
