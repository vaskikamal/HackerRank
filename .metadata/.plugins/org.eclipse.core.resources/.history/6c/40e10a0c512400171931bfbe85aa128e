package vaski.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = 5;

		long[] arr = new long[N];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextLong();
			sum += arr[i];
		}
		Arrays.sort(arr);

		System.out.println((sum - arr[N - 1]) + " " + (sum - arr[0]));
	}
}
