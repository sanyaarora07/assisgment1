
public class IntRoman {
	int val(char x) {
		if (x == 'I')
			return 1;
		if (x == 'V')
			return 5;
		if (x == 'X')
			return 10;
		if (x == 'L')
			return 50;
		if (x == 'C')
			return 100;
		if (x == 'D')
			return 500;
		if (x == 'M')
			return 1000;
		return -1;
	}

	int romanToDec(String str) {
		int r = 0;
		for (int i = 0; i < str.length(); i++) {
			int s1 = val(str.charAt(i));
			if (i + 1 < str.length()) {
				int s2 = val(str.charAt(i + 1));
				if (s1 >= s2) {
					r = r + s1;
				} else {
					r = r + s2 - s1;
					i++;
				}
			} else {
				r = r + s1;
			}
		}

		return r;
	}

	public static void main(String args[]) {
		RomanInt ob = new RomanInt();
		String b = "V";
		System.out.println("Int of  Roman Number"
				+ " is "
				+ ob.romanToDec(b));
	}
}
