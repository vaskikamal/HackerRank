package warmup;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			int spaceCnt = n - i;
			StringBuilder bldr = new StringBuilder();
			for(int j=0;j<spaceCnt;j++){
				bldr.append(" ");
			}
			for(int k=0; k< i;k++){
				bldr.append("#");
			}
			System.out.println(bldr.toString());
		}
	}
}
