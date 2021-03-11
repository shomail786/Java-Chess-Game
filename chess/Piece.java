package chess;

//This class requires your input
public abstract class Piece {
	// Abstract so no instansiation
	private String symbol;
	protected PieceColour colour;

	public String getSymbol() {
		return symbol;
	}	

	public void setSymbol(String s) {
		symbol=s;
	}

	public PieceColour getColour() {
		return colour;
	}

	public abstract boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest);
}

