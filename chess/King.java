package chess;

public class King extends Piece{
	public King (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♔");
		}
		
		else{
			setSymbol("♚");
		}


	}

	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		if (!Board.hasPiece(iDest, jDest) || Board.getPiece(iDest, jDest).getColour() != Board.getPiece(iOrigin, jOrigin).getColour()) {
	
		}
		else {
			return false;
		}


		if(iOrigin - 1 == iDest && jOrigin == jDest){
			// move up
			return true;

		}

		else if(iOrigin -1 == iDest && jOrigin + 1 == jDest){
			// move up right
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin - 1 == jDest){
			// move up left
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin == jDest){
			// move down
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin +1 == jDest){
			// move down right
			return true;

		}

		else if(iOrigin - 1 == iDest && jOrigin - 1 == jDest){
			// move down left
			return true;

		}

		else if(iOrigin == iDest && jOrigin + 1 == jDest){
			// move right
			return true;

		}

		else if(iOrigin == iDest && jOrigin -1 == jDest){
			// move left
			return true;

		}

		else {
			return false;
		}
	}

}