import java.util.ArrayList;

/**
 * @author adinashby
 *
 */

public class Prog2Midterm {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */
	
    public static ArrayList<ArrayList<Integer>> createPascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) {
            return triangle;
        }
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
        
        
        for (int j =1 ; j < i; j++) {
            ArrayList<Integer> prevRow = triangle.get(i -1);
            int num = prevRow.get(j -1) + prevRow.get(j);
            row.add(num);
        }
        
        row.add(1);
        triangle.add(row);
    
      
    }
    return triangle;
    }
}