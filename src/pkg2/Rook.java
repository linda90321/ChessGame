package pkg2;

public class Rook extends Piece {

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		// TODO Auto-generated method stub
		if (initX == targetX) {
			for (int i = Math.min(initY, targetY); i <= Math
					.max(initY, targetY); i++) {
				if (board[targetX][i] != board[initX][initY]
						&& board[targetX][i] != board[targetX][targetY]
						&& board[targetX][i] != null)
					return false;
			}
		} else if (initY == targetY) {
			for (int i = Math.min(initX, targetX); i <= Math
					.max(initX, targetX); i++) {
				if (board[i][targetY] != board[initX][initY]
						&& board[i][targetY] != board[targetX][targetY]
						&& board[i][targetY] != null)
					return false;
			}
			return false;
		}

		return true;
	}
}
