package chess;

public class Rook extends Piece{
	public Rook (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♖");
		}
		
		else{
			setSymbol("♜");
		}

	}
	
	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		if (!Board.hasPiece(iDest, jDest) || Board.getPiece(iDest, jDest).getColour() != Board.getPiece(iOrigin, jOrigin).getColour()) {
	
		}
		else {
			return false;
		}


		int iIncrement = 0;
		int jIncrement = 0;
		int minusI = iDest - iOrigin;
		int minusJ = jDest - jOrigin;
		
		if(minusI == 0 && minusJ > 0){
			// move right
			iIncrement = 0;
			jIncrement = 1;

		}

		else if(minusI == 0 && minusJ < 0){
			// move left
			iIncrement = 0;
			jIncrement = -1;
			
		}

		else if(minusI < 0 && minusJ == 0){
			// move up
			iIncrement = -1;
			jIncrement = 0;

		}

		else if(minusI > 0 && minusJ == 0){
			// move down
			iIncrement = 1;
			jIncrement = 0;
		}

		else{
			return false;
		}
		
		int currentI = iOrigin + iIncrement;
		int currentJ = jOrigin + jIncrement;
		
		while(true){
			if(Board.hasPiece(currentI, currentJ)){
				if(currentI == iDest && currentJ == jDest){
					return true;
				}

			
				else{
					break;
				}
			}
			else if(currentI == iDest && currentJ == jDest){
				return true;
			}
			currentI += iIncrement;
			currentJ += jIncrement;
			
		
		}
		return false;

	}
}
