package implementation;

import java.util.Scanner;

public class kangaroo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		System.out.println((v1 > v2 && (x2 - x1) % (v1 - v2) == 0) ? "YES" : "NO");

	}

}
