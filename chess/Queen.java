package chess;

public class Queen extends Piece{
	public Queen (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♕");
		}
		
		else{
			setSymbol("♛");
		}
	}

	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		// Creates an instance of Rook class and stores result of isLegitMove() into resultRook variable
		Rook r = new Rook(colour);
		boolean resultRook = r.isLegitMove(iOrigin, jOrigin, iDest, jDest);
		
		// Creates an instance of Bishop class and stores result of isLegitMove() into resultBishop variable
		Bishop b = new Bishop(colour);
		boolean resultBishop = b.isLegitMove(iOrigin, jOrigin, iDest, jDest);
		
		boolean valid = false;

		if(resultBishop || resultRook){
			valid = true;
		}
		else{
			valid = false;
		}

		return valid;
	}

}