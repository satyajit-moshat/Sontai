package mobileTesting.demoAppium;

import java.util.HashMap;

public class RemoveDuplicateMrinmoy {
	
	public static void main(String[] args) {
		int[] intArray = new int[]{ 2 };

		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		
//		map.put(intArray[0], "");
		for (int i=1;i<intArray.length; i++ ) {
			if(!(map.containsKey(intArray[i]))) {
				map.put(intArray[i], "");
			}
		}
		
		for(int kk : map.keySet()) {
			System.out.println(kk);
		}
		
	}

}
