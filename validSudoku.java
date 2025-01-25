import java.util.HashSet;

public class validSudoku {
    public static void main(String[] args) {

        boolean response = isValidSudoku();
        System.out.println("Is a valid sudoku? " + response);
    }

    public static boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<Character>();
            columns[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c]; // getting the current value

                // Review if the current position is filled
                if (val == '.') {
                    continue;
                }

                // Inspect the current position. If it has the same value then we have an invalid sudoku
                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                // Now we do the same with columns!
                if (columns[c].contains(val)) return false;
                columns[c].add(val);

                // Review the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val)) return false;
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
