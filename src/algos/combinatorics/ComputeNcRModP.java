package algos.combinatorics;

/**
 * Compute nCr % p
 * where p is a prime number
 */
public class ComputeNcRModP {
    public static void main(String[] args)
    {
        //A = n B = r C = p
        System.out.println(new ComputeNcRModP().solve(5, 2, 13)); //10
        System.out.println(new ComputeNcRModP().solve(6,2, 13)); //2
    }

    public int solve(int A, int B, int C) {
        int nf = factorialModP(A, C);
        int nmrf = factorialModP(A - B, C);
        int rf = factorialModP(B, C);

        long val2 = fastPowerModP(nmrf, C - 2, C);

        long val3 = fastPowerModP(rf, C - 2, C);

        return (int)((nf * ((val2 * val3) % C)) % C);
    }

    public int factorialModP(int A, int C)
    {
        long result = 1;
        for(int i = 1; i <= A; i++)
        {
            result = (result * i) % C;
        }
        return (int) result;
    }

    public int fastPowerModP(int A, int B, int C)
    {
        if ( B == 0)
        {
            return 1;
        }
        long val = fastPowerModP(A, B / 2, C);
        if ( B % 2 == 1)
        {
            return (int)((((val * val) % C) * A) % C);
        }
        return (int)((val * val) % C);
    }
}
