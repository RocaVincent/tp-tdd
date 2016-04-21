package iut.tdd;

public class RomanNumerals {
	
	public String convertToRoman(String arabe) {
		String res="";
		int valeur = Integer.valueOf(arabe);
		if(valeur>=10) {
			res+='X';
			valeur-=10;
		}
		if(valeur==9) return "IX";
		if(valeur>=5) {
			res+='V';
			valeur-=5;
		}
		if(valeur==4) return "IV";
		if(valeur<4) {
			for(int i=0; i<valeur; i++) {
				res+='I';
			}
		}
		return res;
	}

	/*public Object convertFromRoman(String roman) {
		return "1";
	}*/

}
