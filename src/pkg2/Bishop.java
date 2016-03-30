package pkg2;

public class Bishop extends Piece {

	@Override
	public boolean isValid(Piece[][] board, int initX, int initY, int targetX,
			int targetY) {
		// TODO Auto-generated method stub
		if (Math.abs(targetX - initX) == Math.abs(targetY - initY)) {
			int tempX = targetX - initX > 0 ? 1 : -1;
			int tempY = targetY - initY > 0 ? 1 : -1;
			while (Math.abs(targetX - initX) > 1
					|| Math.abs(targetY - initY) > 1) {
				initX += tempX;
				initY += tempY;

				if (board[initX][initY] != null)
					return false;
			}

		}
		return true;

	}

}
