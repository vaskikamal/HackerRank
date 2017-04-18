package vaski.warmup;

import java.util.Scanner;

public class CompareTriplets {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = 3;
		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt();
		}
		
		int ASum = 0, BSum = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] > B[i]) {
				ASum++;
			} else if (A[i] < B[i]) {
				BSum++;
			}
		}
		
		System.out.println(ASum + " " + BSum);
	}
}
