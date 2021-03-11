package chess;

public class Knight extends Piece {
	public Knight (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♘");
		}
		
		else{
			setSymbol("♞");
		}
	}

	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		if (!Board.hasPiece(iDest, jDest) || Board.getPiece(iDest, jDest).getColour() != Board.getPiece(iOrigin, jOrigin).getColour()) {
	
		}
		else {
			return false;
		}

		if(iOrigin + 2 == iDest && jOrigin + 1 == jDest){
			// move 2 down 1 right
			return true;

		}

		else if(iOrigin + 2 == iDest && jOrigin - 1 == jDest){
			// move 2 down 1 left
			return true;

		}

		else if(iOrigin - 2 == iDest && jOrigin - 1 == jDest){
			// move 2 up 1 left
			return true;

		}

		else if(iOrigin - 2 == iDest && jOrigin + 1 == jDest){
			// move 2 up 1 right
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin + 2 == jDest){
			// move 2 right 1 up
			return true;

		}

		else if(iOrigin + 1 == iDest && jOrigin + 2 == jDest){
			// move 2 right 1 down
			return true;

		}

		else if(iOrigin + 1 == iDest && jOrigin - 2 == jDest){
			// move 2 left 1 down
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin - 2 == jDest){
			// move 2 left 1 up
			return true;

		}

		else{
			return false;
		}

	}

}