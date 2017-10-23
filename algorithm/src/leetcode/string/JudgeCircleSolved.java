package leetcode.string;

public class JudgeCircleSolved {
	public static void main(String args[]) {
		String inputStr ="LRLRUD";
		System.out.println(judgeCircle(inputStr));
	}
	
	public static boolean judgeCircle(String moves) {
		int x = 0;
		int y = 0;
		for (char ch : moves.toCharArray()) {
			if (ch == 'U') y++;
			else if (ch == 'D') y--;
			else if (ch == 'L') x++;
			else if (ch == 'R') x--;
			
		}
		if ((x | y) == 0) return true;
		else return false;
				
	}

}
