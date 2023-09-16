package algos.combinatorics;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * 1 <= length of the column title <= 5
 */
public class ExcelColumnNumber {
    public static void main(String[] args)
    {
        System.out.println(new ExcelColumnNumber().titleToNumber("AB")); //28
        System.out.println(new ExcelColumnNumber().titleToNumber("BB")); //54
    }

    public int titleToNumber(String A) {
        int result = 0;
        for(int i = 0; i < A.length(); i++)
        {
            int val = A.charAt(i) - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }
}


