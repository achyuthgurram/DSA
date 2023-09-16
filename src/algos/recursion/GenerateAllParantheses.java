package algos.recursion;

import java.util.ArrayList;

/**
 * Given an integer A pairs of parentheses, write a function to generate
 * all combinations of well-formed parentheses of length 2*A.
 */
public class GenerateAllParantheses {
    ArrayList<String> result;
    public ArrayList<String> generateParenthesis(int A) {
        result = new ArrayList<>();
        generateParenthesis(A, 0, 0, "");
        return result;
    }

    public void generateParenthesis(int A, int opening, int closing, String str) {
        if(str.length() == 2 * A)
        {
            result.add(str);
            return;
        }
        if (opening < A)
        {
            generateParenthesis(A, opening + 1, closing, str + "(");
        }
        if (closing < opening)
        {
            generateParenthesis(A, opening, closing + 1, str + ")");
        }
    }
    public static void main(String[] args)
    {
        printResult(new GenerateAllParantheses().generateParenthesis(2));
        printResult(new GenerateAllParantheses().generateParenthesis(3));
    }

    public static void printResult(ArrayList<String> result)
    {
        result.forEach(System.out::println);
    }
}
