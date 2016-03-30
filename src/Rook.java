/**
 * @author nali
 * 
 *         A rook moves any number of vacant squares in a horizontal or vertical
 *         direction.
 */
public class Rook extends Piece {

	public Rook(String color, String type) {
		super(color, type);
	}

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		if (board[targetX][targetY] != null
				&& board[targetX][targetY].getColor().equals(
						board[initX][initY].getColor())) {
			return false;
		} else if (initX == targetX) {
			for (int i = Math.min(initY, targetY) + 1; i < Math.max(initY,
					targetY); i++) {
				if (board[targetX][i] != null) {
					return false;
				}
			}
		} else if (initY == targetY) {
			for (int i = Math.min(initX, targetX) + 1; i < Math.max(initX,
					targetX); i++) {
				if (board[i][targetY] != null) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

}
