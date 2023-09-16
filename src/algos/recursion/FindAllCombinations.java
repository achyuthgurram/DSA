package algos.recursion;

import java.util.ArrayList;

/**
 * Given two integers A and B, return all possible combinations of B numbers out of 1 2 3 ... A.
 * Make sure the combinations are sorted.
 * To elaborate,
 * Within every entry, elements should be sorted. [1, 4] is a valid entry while [4, 1] is not.
 * Entries should be sorted within themselves.
 */
public class FindAllCombinations {
    ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        result = new ArrayList<>();
        combine(A, B, 1, new ArrayList<>());
        return result;
    }

    public void combine(int A, int B, int current, ArrayList<Integer> list) {
        if(list.size() == B)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        if(current > A)
            return;

        list.add(current);
        combine(A, B, current + 1, list);
        list.remove(list.size() - 1);
        combine(A, B, current + 1, list);
    }
    public static void main(String[] args) {
        printResult(new FindAllCombinations().combine(4,2));
    }

    public static void printResult(ArrayList<ArrayList<Integer>> result) {
        result.forEach(obj -> {
            obj.forEach(n -> System.out.print(n + " "));
            System.out.println();
        });
    }
}
