import java.util.HashMap;

class Solution1 {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();
		int len = completion.length;
		for (int i = 0; i < len; i++)
			map.put(completion[i], map.getOrDefault(completion[i], 0) + 1);

		for (int i = 0; i < len; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0) - 1);
			if (map.get(participant[i]) < 0)
				return participant[i];
		}
		return participant[len];
	}
}


import java.util.Arrays;

class Solution2 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int len = completion.length;
		for (int i = 0; i < len; i++)
			if (!participant[i].equals(completion[i]))
				return participant[i];
		return participant[len];
	}
}
