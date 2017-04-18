package vaski.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		
		double posCnt=0,negCnt=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]> 0){
				posCnt++;
			}else if(arr[i]<0){
				negCnt++;
			}
		}
		System.out.println(posCnt/n);
		System.out.println(negCnt/n);
		System.out.println((n-(posCnt+negCnt))/n);
	}
}
