package MyPak;

public class Jstringfun {
	public static void main(String[] args) {

		// Number of words in a para
		int words = 1;
		String para = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.";

		char[] pc = new char[para.length()];

		for (int i = 0; i < para.length(); i++) {
			pc[i] = para.charAt(i);
			// System.out.println(pc[i]);
			if (pc[i] == ' ') {
				words += 1;
			}
		}
		System.out.println("Total words = " + words);
		// String palindrome
		String s = "amma";
		String rev = "";
		String store = "";
		char[] sc = new char[s.length()];

		for (int j = s.length() - 1; j >= 0; j--) {
			sc[j] = s.charAt(j);
			// System.out.println(sc[j]);
			rev = rev + sc[j];
		}
		System.out.println("Original String=" + s);

		System.out.println("Reverse String=" + rev);

		if (s.equals(rev)) {
			System.out.println("The given string is palindorme");
		} else {
			System.out.println("The given string is not a palindorme");
		}
		
		// Odd number capital number small
		String sval = "selenium";

		char[] svalc = new char[sval.length()];

		System.out.print("Odd indexed are capitalized  :");
		for (int n = 0; n < sval.length(); n++) {
			if (n % 2 == 0) {
				System.out.print(svalc[n] = Character.toUpperCase(sval.charAt(n)));
			} else {
				System.out.print(svalc[n] = sval.charAt(n));
			}
		}
		// Even number capital number small

		String sval2 = "selenium";

		char[] svalc2 = new char[sval2.length()];
		System.out.println("");
		System.out.print("Even indexed are capitalized  :");
		for (int n = 0; n < sval2.length(); n++) {
			if (n % 2 != 0) {
				System.out.print(svalc2[n] = Character.toUpperCase(sval2.charAt(n)));
			} else {
				System.out.print(svalc2[n] = sval2.charAt(n));
			}
		}
		
	}
}
