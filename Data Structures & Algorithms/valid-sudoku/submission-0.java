class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> quads = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int quad = 10 * (i / 3) + (j / 3);
                int col = j;
                int row = i;
                char square = board[i][j];
                if (square == '.') {
                    continue;
                }
                if (!cols.containsKey(col)) {
                    cols.put(col, new HashSet<>());
                }
                if (!rows.containsKey(row)) {
                    rows.put(row, new HashSet<>());
                }
                if (!quads.containsKey(quad)) {
                    quads.put(quad, new HashSet<>());
                }
                if (cols.get(col).contains(square)
                      || rows.get(row).contains(square) 
                      || quads.get(quad).contains(square)) {
                    return false;
                } else {
                    cols.get(col).add(square);
                    rows.get(row).add(square);
                    quads.get(quad).add(square);
                }

            }
        }
        return true;
        
    }
}
