/**
 * @author nali
 * 
 *         The queen moves any number of vacant squares in a horizontal,
 *         vertical, or diagonal direction.
 */
public class Queen extends Piece {

	public Queen(String color, String type) {
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
		} else if (Math.abs(targetX - initX) == Math.abs(targetY - initY)) {
			int tempX = targetX - initX > 0 ? 1 : -1;
			int tempY = targetY - initY > 0 ? 1 : -1;
			while (Math.abs(targetX - initX) > 1
					|| Math.abs(targetY - initY) > 1) {
				initX += tempX;
				initY += tempY;

				if (board[initX][initY] != null) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

}
