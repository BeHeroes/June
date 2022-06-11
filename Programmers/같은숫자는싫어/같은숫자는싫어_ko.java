import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int len = arr.length;
    
		list.add(arr[0]);
		for (int i = 0; i < len - 1; i++)
			if (arr[i] != arr[i + 1])
				list.add(arr[i + 1]);

		len = list.size();
		int[] answer = new int[len];

		for (int i = 0; i < len; i++)
			answer[i] = list.get(i);

		return answer;
	}
}
