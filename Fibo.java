package HomeworkDSday2;

import java.util.Arrays;

public class Fibo {
	public static void main(String[] args) {
		int number = 25;
		System.out.println("Fibonacci of " + number + " is " + calFibo(number));
		System.out.println("O(n)");
		System.out.println("ĐỂ EM NGHĨ XEM CÁCH TỐI ƯU HƠN :)))");

	}

	public static long calFibo(int number) {
		long fibo[] = new long[number + 2];
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[(i - 1)] + fibo[(i - 2)];
		}
		return fibo[number];
	}
}
