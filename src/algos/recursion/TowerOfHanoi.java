package algos.recursion;

public class TowerOfHanoi {
    int index = 0;
    int[][] result;

    public int[][] towerOfHanoi(int A) {
        int moves = (1 << A) - 1;
        result = new int[moves][3];
        towerOfHanoi(A, 1, 3, 2, result);
        return result;
    }

    public void towerOfHanoi(int A, int start, int destination, int helper, int[][] result)
    {
        if ( A == 0)
            return;
        towerOfHanoi(A - 1, start, helper, destination, result);
        result[index++] = new int[]{A, start, destination};
        towerOfHanoi(A - 1, helper, destination, start, result);
    }
    public static void main(String[] args) {
        printMoves(new TowerOfHanoi().towerOfHanoi(3));
    }

    public static void printMoves(int[][] moves)
    {
        for(int[] move : moves)
        {
           System.out.printf("Move %d disk from %d to %d%n", move[0], move[1], move[2]);
        }
    }
}
