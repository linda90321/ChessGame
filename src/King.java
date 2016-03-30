/**
 * @author nali
 * 
 *         The king moves exactly one square horizontally, vertically, or
 *         diagonally.
 */
public class King extends Piece {

	public King(String color, String type) {
		super(color, type);
	}

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		if (board[targetX][targetY] != null
				&& board[targetX][targetY].getColor().equals(
						board[initX][initY].getColor())) {
			return false;
		} else if (targetX == initX && targetY == initY) {
			return false;
		} else if (Math.abs(targetX - initX) <= 1
				&& Math.abs(targetY - initY) <= 1) {
			return true;
		}
		return false;
	}

}
