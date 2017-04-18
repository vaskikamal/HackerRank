package vaski.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class BirthDay_Candles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            A[height_i] = in.nextInt();
        }
		int maxHeight = Arrays.stream(A).max().getAsInt();
		System.out.println((int) Arrays.stream(A).filter(height -> height == maxHeight).count());

    }

}
