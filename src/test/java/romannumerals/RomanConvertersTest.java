package romannumerals;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static romannumerals.RomanConverters.convert;


import org.junit.Test;

public class RomanConvertersTest {

	@Test
	public void shouldReturnRomanNumbers()
	{
		checkToRoman(1, "I");
		checkToRoman(2, "II");
		checkToRoman(3, "III");
		checkToRoman(4, "IV");
		checkToRoman(5, "V");
		checkToRoman(6, "VI");
		checkToRoman(9, "IX");
		checkToRoman(10, "X");
		// Some verification asserts
		checkToRoman(999, "CMXCIX");
		checkToRoman(1999, "MCMXCIX");
		checkToRoman(1990, "MCMXC");
		checkToRoman(2008, "MMVIII");
		checkToRoman(2751, "MMDCCLI");
		checkToRoman(3999, "MMMCMXCIX");
	}

	@Test
	public void shouldReturnArabicNumbers() throws Exception
	{
		checkToArabic("I", 1);
		checkToArabic("II", 2);
		checkToArabic("III", 3);
		checkToArabic("IV", 4);
		checkToArabic("V", 5);
		// Some verification asserts
		checkToArabic("CMXCIX", 999);
		checkToArabic("MCMXCIX", 1999);
		checkToArabic("MCMXC", 1990);
		checkToArabic("MMVIII", 2008);
		checkToArabic("MMDCCLI", 2751);
		checkToArabic("MMMCMXCIX", 3999);
	}

	@Test
	public void shouldNotReturnCorrectRomanNumbers()
	{
		checkWrongValueToRoman(2, "I");
		checkWrongValueToRoman(14124, "MMMMXXXII");

	}

	@Test
	public void shouldNotReturnCorrectArabicNumbers()
	{
		checkWrongValueToArabic("I", 2);
		checkWrongValueToArabic("MMMMXXXII", 848);

	}

	private void checkToRoman(int arabic, String roman)
	{
		assertThat(convert(arabic).toRoman(), is(equalTo(roman)));
	}

	private void checkToArabic(String roman, int arabic)
	{
		assertThat(convert(roman).toArabic(), is(equalTo(arabic)));
	}

	private void checkWrongValueToRoman(int arabic, String roman)
	{
		assertThat(convert(arabic).toRoman(), not(equalTo(roman)));
	}

	private void checkWrongValueToArabic(String roman, int arabic)
	{
		assertThat(convert(roman).toArabic(), not(equalTo(arabic)));
	}

}
