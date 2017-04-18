package implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading
 * @author vaski
 *
 */
public class grading_students {

	 static int solve(int grades) {
			int nextFive = (grades / 5 + 1) * 5;
			int diff = nextFive - grades;
			return diff < 3 ? nextFive:grades;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for (int grades_i = 0; grades_i < n; grades_i++) {
				int grade = in.nextInt();
				System.out.println(grade < 38 ? grade : solve(grade));
			}

		}
}
