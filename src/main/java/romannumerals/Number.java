package romannumerals;

import java.util.ArrayList;
import java.util.List;

public class Number {
	static final List<Par> EQUIVALENCY_TABLE;
	static {
		EQUIVALENCY_TABLE = new ArrayList<Par>();
		EQUIVALENCY_TABLE.add(new Par(1000, "M"));
		EQUIVALENCY_TABLE.add(new Par(900, "CM"));
		EQUIVALENCY_TABLE.add(new Par(500, "D"));
		EQUIVALENCY_TABLE.add(new Par(400, "CD"));
		EQUIVALENCY_TABLE.add(new Par(100, "C"));
		EQUIVALENCY_TABLE.add(new Par(90, "XC"));
		EQUIVALENCY_TABLE.add(new Par(50, "L"));
		EQUIVALENCY_TABLE.add(new Par(40, "XL"));
		EQUIVALENCY_TABLE.add(new Par(10, "X"));
		EQUIVALENCY_TABLE.add(new Par(9, "IX"));
		EQUIVALENCY_TABLE.add(new Par(5, "V"));
		EQUIVALENCY_TABLE.add(new Par(4, "IV"));
		EQUIVALENCY_TABLE.add(new Par(1, "I"));
	}
}
