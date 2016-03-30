/**
 * @author nali
 * 
 *         A knight moves to the nearest square not on the same rank, file, or
 *         diagonal.
 */
public class Knight extends Piece {

	public Knight(String color, String type) {
		super(color, type);
	}

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		if (board[targetX][targetY] != null
				&& board[targetX][targetY].getColor().equals(
						board[initX][initY].getColor())) {
			return false;
		} else if ((Math.abs(targetX - initX) == 2 && Math.abs(targetY - initY) == 1)
				|| (Math.abs(targetX - initX) == 1 && Math.abs(targetY - initY) == 2)) {
			return true;
		}
		return false;
	}

}
