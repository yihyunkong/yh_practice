package com.fizzbuzz;

public class FizzBuzzGame_str {

	public static void main(String[] args) {
		int i = 1;
		
		String fz = "Fizz";
		String bz = "Buzz";
		String fb = "FizzBuzz";
		
		while(i < 101) {
			if((i%5 == 0) && (i%7 == 0)) {
				System.out.println(fb);
			} else if(i%5 == 0) {
				System.out.println(fz);
			} else if(i%7 == 0) {
				System.out.println(bz);
			} else {
				
			}
		}
	}

}
