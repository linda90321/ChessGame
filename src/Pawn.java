/**
 * @author nali
 * 
 *         A pawn moves straight forward one square, if that square is vacant.
 *         If it has not yet moved, a pawn also has the option of moving two
 *         squares straight forward, provided both squares are vacant. Pawns
 *         cannot move backwards. Pawns are the only pieces that capture
 *         differently from how they move. A pawn can capture an enemy piece on
 *         either of the two squares diagonally in front of the pawn (but cannot
 *         move to those squares if they are vacant).
 */
public class Pawn extends Piece {

	public Pawn(String color, String type) {
		super(color, type);
	}

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		if (this.getColor().equals("White")) {
			if (Math.abs(targetX - initX) == 1 && targetY - initY == 1
					&& board[targetX][targetY] != null
					&& board[targetX][targetY].getColor().equals("Black"))
				return true;

			if (initX == targetX && initY == 1 && targetY - initY == 2
					&& board[targetX][initY + 1] == null
					&& board[targetX][initY + 2] == null)
				return true;

			if (initX == targetX && targetY - initY == 1
					&& board[targetX][targetY] == null)
				return true;

		}

		if (this.getColor().equals("Black")) {
			if (Math.abs(targetX - initX) == 1 && initY - targetY == 1
					&& board[targetX][targetY] != null
					&& board[targetX][targetY].getColor().equals("White"))
				return true;

			if (initX == targetX && initY == 6 && initY - targetY == 2
					&& board[targetX][initY - 1] == null
					&& board[targetX][initY - 2] == null)
				return true;

			if (initX == targetX && initY - targetY == 1
					&& board[targetX][targetY] == null)
				return true;

		}

		return false;
	}

}
