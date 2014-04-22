package main;

public class ProblemOne {

	/**
	 *  Project Euler, Problem 1
	 *  Multiples of 3 & 5
	 *  Scott Gilmour
	 */
	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000));
	}
	
	/**
	 * @param n : integer to multiply 
	 */
	public static int sumOfMultiples(int n) {
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		
		return sum;
	}

}
