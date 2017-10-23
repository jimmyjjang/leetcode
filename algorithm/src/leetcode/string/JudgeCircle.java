package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JudgeCircle {
	public static void main(String args[]) {
		String inputStr = "LL";
		System.out.print(judgeCircle(inputStr));

	}

	public static boolean judgeCircle(String moves) {
		ArrayList inputAr = new ArrayList();
		List<String> items = Arrays.asList(moves.split(""));
		HashMap<String, Integer> hp = new HashMap<String, Integer>();
		hp.put("U", 0);
		hp.put("D", 0);
		hp.put("L", 0);
		hp.put("R", 0);
		
		
		if (items.size() % 2 != 0) {
//			System.out.println(items.size());
			return false;
		}

		for (int i = 0; i < items.size(); i++) {
//			if (hp.containsKey(items.get(i))) {
				hp.put(items.get(i),hp.get(items.get(i))+1);
//			} else {
//				hp.put(items.get(i),1);
//			}
//			System.out.println(items.get(i));
		}
		int lrsum = hp.get("L") - hp.get("R");
		int udsum = hp.get("U") - hp.get("D");
		System.out.println(lrsum);
		System.out.println(udsum);
		if ((lrsum != 0) || ( udsum != 0 )){
			return false;
		}
//		if (hp.size() > 0) {
//			return false;
//		}
		return true;
	}
}
