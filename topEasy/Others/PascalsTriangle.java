package leetCode.topEasy.Others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generate(3).stream().forEach(list -> {
			System.out.println();
			list.stream().forEach(System.out :: print);
		});
	}

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<>();
    	for(int i = 0; i < numRows; i++) {
    		List<Integer> row = new ArrayList<>();
    		for (int j =0; j <= i; j++) {
    			if(j == 0 || j == i) {
        			row.add(1);
        		}else {
        			row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        		}
    		}
    		res.add(row);
    	}
    	return res;
    }	
}
