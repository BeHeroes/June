import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int len = commands.length;
		int[] answer = new int[len];
		int nLen;
		int[] nList;
    
		for (int i = 0; i < len; i++) {
			nLen = commands[i][1] - commands[i][0] + 1;
			nList = new int[nLen];
			for (int j = commands[i][0]; j <= commands[i][1]; j++)
				nList[j - commands[i][0]] = array[j - 1];
			Arrays.sort(nList);
			answer[i] = nList[commands[i][2] - 1];
		}

		return answer;
	}
}
