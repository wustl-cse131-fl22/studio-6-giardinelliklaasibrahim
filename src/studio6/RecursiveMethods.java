package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if(n==0) {
			return 0;
		}
			return Math.pow(2, -1*n)+ geometricSum(n-1);
		
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
		if(q == 0) {
			return p;
		}
		int temp = q;
		q = p % q;
		p = temp;
		
		return gcd(p,q);
			// FIXME compute the gcd of p and q using recursion
	}
	
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
		int arr2[] = new int[array.length];
		
		return rev(0, array, arr2);
		
	}
	
	public static int[] rev(int i, int arr[], int arr2[]) {
		if (i == arr.length) {
			return arr2;
		}
		arr2[arr.length-i-1] = arr[i];
		
	return rev(i+1, arr, arr2);
					// FIXME create a helper method that can recursively reverse the given array
				
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
