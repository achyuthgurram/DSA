package algos.math;

public class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        //A = 5
        //5! = 120
        //trailing zeroes = 1
        System.out.println(new TrailingZeroesInFactorial().trailingZeroes(5)); //1

        //A = 6
        //6! = 720
        //trailing zeroes = 1
        System.out.println(new TrailingZeroesInFactorial().trailingZeroes(6)); //1

        //A = 10
        //10! = 3628800
        //trailing zeroes = 2
        System.out.println(new TrailingZeroesInFactorial().trailingZeroes(10)); //2
    }

    //multiplying 2 and 5 will create a trailing zero
    //so we need to count the number of 5s in the factorial because the number of 2s
    //will always be greater than the number of 5s
    //we can count the number of 5s in the factorial by dividing the number by 5, 25, 125, etc
    public int trailingZeroes(int A) {
        int count = 0;
        int x = 5;
        while (A / x > 0)
        {
            count += (A / x);
            x = x * 5;
        }
        return count;
    }
}
