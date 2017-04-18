package vaski.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int diag1 = 0, diag2 = 0;
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][i]);
			diag1 += arr[i][i];
		}
		for (int i = N-1,j=0; i >= 0 && j < N; i--,j++) {
			System.out.println(arr[i][j]);

			diag2 += arr[i][j];
		}

		System.out.println(Math.abs(diag1 - diag2));
	}
}
