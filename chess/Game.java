package chess;
import java.io.Console;
public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play(){
		String turn = "White";
		while (!gameEnd){
			CheckInput validate = new CheckInput();
			Console c = System.console();
			String originStr;
			
			System.out.println("\n---------- " + turn + " ----------\n");
			originStr = c.readLine("Enter origin : ");
			
			if(originStr.equals("END")){
				System.out.println(turn + " resigned!");
				gameEnd = true;
				break;
			}

			else if(validate.checkCoordinateValidity(originStr) == false){
				System.out.println("Invalid source co-ordinates");
				
				continue;
			}

			int iOrigin = Character.getNumericValue(originStr.charAt(0) ) - 1;
			int jOrigin = "abcdefgh".indexOf(originStr.charAt(1));

			if(Board.hasPiece(iOrigin, jOrigin) == false){
				System.out.println("No piece at co-ordinates");
				continue;
			}

			Piece sourcePiece = Board.getPiece(iOrigin, jOrigin);
			if(sourcePiece.getColour() == PieceColour.WHITE && turn == "White" || sourcePiece.getColour() == PieceColour.BLACK && turn == "Black"){

			}

			else{
				System.out.println("Not your turn");
				continue;
			}

			String destStr  = c.readLine("Enter destination : ");
			
			if(validate.checkCoordinateValidity(destStr) == false){
				System.out.println("Invalid destination co-ordinates");
				
				continue;
			}

			int iDest = Character.getNumericValue(destStr.charAt(0) ) - 1;
			int jDest = "abcdefgh".indexOf(destStr.charAt(1));

			if (sourcePiece.isLegitMove(iOrigin, jOrigin, iDest, jDest) == false) {
				System.out.println("Move not legit");
				continue;
			}
			
			if(Board.movePiece(iOrigin, jOrigin, iDest, jDest, sourcePiece)){
				Board.printBoard();
				System.out.println(turn + " is the winner!");
				gameEnd = true;
			}


			else{
				Board.printBoard();
				
				if(turn == "White"){
					turn = "Black";
				}

				else{
					turn = "White";
				}
				
			}

		}		
	}
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
