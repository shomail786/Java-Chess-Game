package chess;

public class Pawn extends Piece{	
	public Pawn (PieceColour p){
		colour = p;
		if (p == PieceColour.WHITE){
			setSymbol("♙");
		}
		
		else{
			setSymbol("♟︎");
		}
	}

	@Override
	public boolean isLegitMove(int iOrigin, int jOrigin, int iDest, int jDest){
		
		if (!Board.hasPiece(iDest, jDest)){
			
			if(jOrigin == jDest){
				
				if(Board.getPiece(iOrigin, jOrigin).getColour() == PieceColour.WHITE){
					
					if(iOrigin -1 == iDest){
						return true;
					// Move 1 up if white
					}

					else if(iOrigin == 6 && iOrigin - 2 == iDest){
						if(Board.hasPiece(iOrigin - 1, jOrigin)){
							return false;
						}
						else{
							return true;	
						}
					// Move 2 up if white	
					}
				}
				else{
					
					if(iOrigin + 1 == iDest){
						return true;
						// move 1 down if black
					}

					else if(iOrigin == 1 && iOrigin + 2 == iDest){
						if(Board.hasPiece(iOrigin + 1, jOrigin)){
							return false;
						}
						else{
							return true;	
						}
					// Move 2 down if black	
					}
				}
			}

			else{
				return false;
			}
		
		}
		
		else if(Board.getPiece(iDest, jDest).getColour() != Board.getPiece(iOrigin, jOrigin).getColour()) {

			if(jOrigin + 1 == jDest || jOrigin - 1 == jDest){

				if(Board.getPiece(iOrigin, jOrigin).getColour() == PieceColour.WHITE){

					if(iOrigin - 1 == iDest){
						return true;
					}
					// Move 1 row up if white

				}

				else{
					if(iOrigin + 1 == iDest){
						return true;
					// Move 1 row up if black
					}
					
				}
			}
		}
		return false;
	}
}