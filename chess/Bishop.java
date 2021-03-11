package chess;

public class Bishop extends Piece {
	public Bishop (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♗");
		}
		
		else{
			setSymbol("♝");
		}

	}

	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		if (!Board.hasPiece(iDest, jDest) || Board.getPiece(iDest, jDest).getColour() != Board.getPiece(iOrigin, jOrigin).getColour()) {
	
		}
		else {
			return false;
		}
		int minusI = iDest - iOrigin;
		int minusJ = jDest - jOrigin;
		int iIncrement = 0;
		int jIncrement = 0;


		if(minusI == -minusJ && minusJ > 0){
			// move up right diagonal
			iIncrement = -1;
			jIncrement = 1;

		}

		else if(minusI == minusJ && minusJ < 0){
			// move up left diagonal
			iIncrement = -1;
			jIncrement = -1;
		}

		else if(minusI == minusJ && minusJ > 0){
			// move down right diagonal
			iIncrement = 1;
			jIncrement = 1;
			
		}

		else if(minusI == -minusJ && minusJ < 0){
			// move down left diagonal
			iIncrement = 1;
			jIncrement = -1;

		}

		else{
			return false;
		}

		int currentI = iOrigin + iIncrement;
		int currentJ = jOrigin + jIncrement;
		
		while(true){
			if(Board.hasPiece(currentI, currentJ)){
				// Checks if next square has piece and is target location
				if(currentI == iDest && currentJ == jDest){
					return true;
				}

				// breaks as there is a piece in between
				else{
					break;
				}
			}
			// Checks if next square is empty and is target location
			else if(currentI == iDest && currentJ == jDest){
				return true;
			}
			currentI += iIncrement;
			currentJ += jIncrement;
			
		
		}
		return false;
	}

	
}