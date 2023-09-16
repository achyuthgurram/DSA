package algos.combinatorics;

/**
 * Given a positive integer A, return its corresponding
 * column title as it appears in an Excel sheet.
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     1 <= A <= 10pow(9)
 */
public class ExcelColumnTitle {
    public static void main(String[] args)
    {
        System.out.println(new ExcelColumnTitle().convertToTitle(26)); //Z
        System.out.println(new ExcelColumnTitle().convertToTitle(52)); //AZ
    }

    public String convertToTitle(int A) {
        StringBuilder result = new StringBuilder();
        while(A > 0)
        {
            char nextChar = (char)(65 + ((A - 1) % 26));
            result.insert(0, nextChar);
            A = (A - 1) / 26;
        }
        return result.toString();
    }
}


