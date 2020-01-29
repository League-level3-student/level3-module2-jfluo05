package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] unsorted = {"hi","jessica", "soccer"};
		assertEquals(1,_00_LinearSearch.linearSearch(unsorted, "jessica"));
		assertEquals(-1,_00_LinearSearch.linearSearch(unsorted, "jordan"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] sorted = {0,2,6,7,9};
		assertEquals(2,_01_BinarySearch.binarySearch(sorted,0,sorted.length-1,6 ));
		assertEquals(-1,_01_BinarySearch.binarySearch(sorted,1,sorted.length-1,0 ));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] sorted2 = {0,2,4,6,8};
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(sorted2,4));
		assertEquals(4,_02_InterpolationSearch.interpolationSearch(sorted2,8));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] sorted2 = {0,2,4,6,8};
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(sorted2,4));
		assertEquals(4,_02_InterpolationSearch.interpolationSearch(sorted2,8));
	}
}
