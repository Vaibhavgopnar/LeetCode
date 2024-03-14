package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		int row = 5;
		 System.out.println(generate(row));
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < numRows; i++) {
			List<Integer> temp = new ArrayList<>();
			int num = 1;

			for (int k = 0; k <= i; k++) {

				temp.add(num);
				num = num * (i - k) / (k + 1); 
				
			}
			list.add(temp);
		}

		return list;
	}
}
