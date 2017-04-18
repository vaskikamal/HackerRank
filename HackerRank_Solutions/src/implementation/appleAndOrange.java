package implementation;

import java.util.Scanner;

public class appleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		int appCnt = 0;
		for (int apple_i = 0; apple_i < m; apple_i++) {
			int entry = in.nextInt();

			if (a + entry >= s && a + entry <= t) {
				appCnt++;
			}
		}
		int orCnt=0;
		for (int orange_i = 0; orange_i < n; orange_i++) {
			int entry = in.nextInt();

			if (b + entry >= s && b + entry <= t) {
				orCnt++;
			}
		}
		
		System.out.println(appCnt);
		System.out.println(orCnt);

	}
}
