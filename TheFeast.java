package HomeworkDSday2;

public class TheFeast {
	public static void main(String[] args) {
		int n = 25;
		int c = 5;
		int m = 2;
		System.out.println("Total : " + theFeast(n, c, m));
	}

	public static int theFeast(int n, int c, int m) {
		int bars = n / c;
		int wrappers = bars;
		if (n % c == 0) {
			while (wrappers >= m) {
				int freeBars = wrappers / m;
				bars += freeBars;
				wrappers = freeBars + (wrappers % m);
			}
			return bars;
		} else {
			return -1;
		}
	}
}
