import java.util.Scanner;

/**
 * @author nali
 * 
 *         Legal Input:
 * 
 *         For example: A2WhitePawn/A1WhiteRook/C8BlackBishop Black
 * 
 *         A2 is the position of the piece. Legal position is from A1 to H8.
 * 
 *         White is the color of the piece. Legal color is White or Black.
 * 
 *         Pawn is the type of the piece. Legal Type is King, Queen, Bishop,
 *         Knight, Rook, Pawn.
 * 
 *         Black (after the space) is the current player. Legal player is White
 *         or Black.
 * 
 */
public class Chess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String curBoard = input.next();
		String player = input.next();
		String[] cBoard = curBoard.split("/");

		// Initialize a new board with Pieces placed as input. And input must valid.
		Board board = new Board();
		for (int i = 0; i < cBoard.length; i++) {
			if (cBoard[i].charAt(0) >= 'A'
					&& cBoard[i].charAt(0) <= 'H'
					&& cBoard[i].charAt(1) >= '1'
					&& cBoard[i].charAt(1) <= '8'
					&& cBoard[i].length() >= 11
					&& cBoard[i].length() <= 13
					&& (cBoard[i].substring(2, 7).equals("White") 
							|| cBoard[i].substring(2, 7).equals("Black"))
					&& (cBoard[i].substring(7).equals("Pawn")
							|| cBoard[i].substring(7).equals("Bishop")
							|| cBoard[i].substring(7).equals("King")
							|| cBoard[i].substring(7).equals("Knight")
							|| cBoard[i].substring(7).equals("Queen") 
							|| cBoard[i].substring(7).equals("Rook"))
					&& (player.equals("White") || player.equals("Black"))) {

				board.initPiece(cBoard[i].charAt(0) - 'A',
						cBoard[i].charAt(1) - '1', PieceFactory.getPiece(
								cBoard[i].substring(2, 7),
								cBoard[i].substring(7)));
			} else {
				System.out
						.print("Input invalid. Please input the valid string.\nThe string pattern like A2WhitePawn/B2WhitePawn... ");
				return;
			}
		}

		// Output possible moves for each Piece and count for legal moves and
		// unique pieces
		int uniquePieces = 0;
		int legalMoves = 0;
		for (int i = 0; i < cBoard.length; i++) {
			if (cBoard[i].substring(2, 7).equals(player)) {
				legalMoves += board.movePiece(cBoard[i].charAt(0) - 'A',
						cBoard[i].charAt(1) - '1');
				uniquePieces++;
			}
		}

		System.out.println(legalMoves + " legal moves (" + uniquePieces
				+ " unique pieces) for " + player + " player");
	}

}
