public class Board {
	public Piece[][] board = new Piece[8][8];

	public Board() {
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[0].length; y++) {
				board[x][y] = null;
			}
		}
	}

	public void initPiece(int x, int y, Piece p) {
		board[x][y] = p;
	}

	public int movePiece(int initX, int initY) {
		int legalMoves = 0;
		Piece p = board[initX][initY];
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[0].length; y++) {
				if (p.isValid(board, initX, initY, x, y)) {
					System.out.println(p.type + " at <" + (char) (initX + 65)
							+ ":" + (char) (initY + 49) + "> can move to <"
							+ (char) (x + 65) + ":" + (char) (y + 49) + ">");
					legalMoves++;
				}
			}
		}
		return legalMoves;
	}

}
