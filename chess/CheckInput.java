package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		if (input.length() != 2){
			return false;
		}
		
		int num = Character.getNumericValue(input.charAt(0));
		String letter = Character.toString(input.charAt(1));
		if(num >= 1 && num <=8){
			if(("abcdefgh").contains(letter)){
				return true;
			}
		}
		return false;

	}
}
