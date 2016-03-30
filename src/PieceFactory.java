public class PieceFactory {

	public static Piece getPiece(String color, String type) {
		if (type.equals("Bishop")) {
			return new Bishop(color, type);
		} else if (type.equals("King")) {
			return new King(color, type);
		} else if (type.equals("Knight")) {
			return new Knight(color, type);
		} else if (type.equals("Pawn")) {
			return new Pawn(color, type);
		} else if (type.equals("Queen")) {
			return new Queen(color, type);
		} else if (type.equals("Rook")) {
			return new Rook(color, type);
		} else {
			return null;
		}
	}

}
