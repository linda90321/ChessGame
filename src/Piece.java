public abstract class Piece {
	public String color;
	public String type;

	public Piece(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public Piece(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract boolean isValid(Piece[][] board, int initX, int initY,
			int targetX, int targetY);
    
}
