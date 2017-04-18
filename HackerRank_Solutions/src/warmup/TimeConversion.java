package vaski.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 * 
 *
 */
public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();

		String[] split = time.split(":");
		
		String hours = split[0];
		String mins = split[1];
		String secs = split[2].substring(0,2);
		String eve = split[2].substring(2,4);
        if(eve.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+mins+":"+secs);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+mins+":"+secs);
        }
	}
}
