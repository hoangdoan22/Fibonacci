package HomeworkDSday2;

public class SwapLetter {
	public static void main(String[] args) {
		String S = "baaaaa";
		String S1 = "baaabbaabbba";
		String S2 = "baabab";
		String S3 = "bbbbbabbbbaaaaa";

		System.out.println(solution(S));
		System.out.println(solution(S1));
		System.out.println(solution(S2));
		System.out.println(solution(S3));
	}

	public static int solution(String S) {
		char[] c = S.toCharArray();
		int count = 0;
		for (int i = 1; i < c.length - 1; i++) {
			if (c[i] == c[i - 1] && c[i] == c[i + 1]) {
				count++;
				i += 2;
			}
		}
		return count;

	}

}
