package Chess;

public class Knight {
    public int row;    // 0–7 (row index on Board.board)
    public int col;    // 0–7 (column index)
    public String color;

    public Knight(String color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
    }


	public boolean canMoveTo(int destRow, int destCol) {
        // Check boundaries
        if (destRow < 0 || destRow >= 8 || destCol < 0 || destCol >= 8)
            return false;

        // Compute differences
        int dRow = Math.abs(destRow - row);
        int dCol = Math.abs(destCol - col);

        // Knight's legal L-shape
        boolean validMove = (dRow == 2 && dCol == 1) || (dRow == 1 && dCol == 2);

        // Optionally, check if destination is occupied by same color
        // (you’ll handle that once you store pieces on the board)

        return validMove;
    }

    public String getPosition() {
        return Board.board[row][col];
    }

    public void moveTo(int destRow, int destCol) {
        if (canMoveTo(destRow, destCol)) {
            this.row = destRow;
            this.col = destCol;
        } else {
            System.out.println("Illegal move for Knight!");
        }
    }
}
