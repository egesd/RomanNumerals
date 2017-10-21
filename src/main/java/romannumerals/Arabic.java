package romannumerals;

public class Arabic extends Number {
	private int arabic;

	Arabic(int arabic) {
		this.arabic = arabic;
		
	}

	public String toRoman() {
		String roman = "";
		for (Par par : EQUIVALENCY_TABLE) {
			while (arabic >= par.getArabic()) {
				roman += par.getRoman();
				arabic -= par.getArabic();
			}
		}
		return roman;
	}
}
