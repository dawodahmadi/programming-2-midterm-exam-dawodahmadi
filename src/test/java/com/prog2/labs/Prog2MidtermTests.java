
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class Prog2MidtermTests {

	@Test
	void createPascalTriangleTest1()  {
		ArrayList<ArrayList<Integer>> lists = Prog2Midterm.createPascalTriangle(5);
		
		Integer[][] actual = new Integer[lists.size()][];
		Integer[][] expected = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
		
		Integer[] blankArray = new Integer[0];
		
		for(int i = 0; i < lists.size(); i++) {
			actual[i] = lists.get(i).toArray(blankArray);
		}
		
		System.out.println(Arrays.deepToString(actual));
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void createPascalTriangleTest2() {
		ArrayList<ArrayList<Integer>> lists = Prog2Midterm.createPascalTriangle(1);
		
		Integer[][] actual = new Integer[lists.size()][];
		Integer[][] expected = {{1}};
		
		Integer[] blankArray = new Integer[0];
		
		for(int i = 0; i < lists.size(); i++) {
			actual[i] = lists.get(i).toArray(blankArray);
		}
		
		System.out.println(Arrays.deepToString(actual));
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void createPascalTriangleTest3() {
		ArrayList<ArrayList<Integer>> lists = Prog2Midterm.createPascalTriangle(2);
		
		Integer[][] actual = new Integer[lists.size()][];
		Integer[][] expected = {{1}, {1, 1}};
		
		Integer[] blankArray = new Integer[0];
		
		for(int i = 0; i < lists.size(); i++) {
			actual[i] = lists.get(i).toArray(blankArray);
		}
		
		System.out.println(Arrays.deepToString(actual));
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void createPascalTriangleTest4() {
		ArrayList<ArrayList<Integer>> lists = Prog2Midterm.createPascalTriangle(3);
		
		Integer[][] actual = new Integer[lists.size()][];
		Integer[][] expected = {{1}, {1, 1}, {1, 2, 1}};
		
		Integer[] blankArray = new Integer[0];
		
		for(int i = 0; i < lists.size(); i++) {
			actual[i] = lists.get(i).toArray(blankArray);
		}
		
		System.out.println(Arrays.deepToString(actual));
		
		
		assertArrayEquals(expected, actual);
	}
	
}
