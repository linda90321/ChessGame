/**
 * @author nali
 * 
 *         A bishop moves any number of vacant squares in any diagonal
 *         direction.
 */
public class Bishop extends Piece {

	public Bishop(String color, String type) {
		super(color, type);
	}

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		if (board[targetX][targetY] != null
				&& board[targetX][targetY].getColor().equals(
						board[initX][initY].getColor())) {
			return false;
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
