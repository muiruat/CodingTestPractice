import java.util.HashMap;

class Solution {
	public String solution(String[] survey, int[] choices) {
		char[][] personalities = { { 'R', 'T' }, { 'C', 'F' }, { 'J', 'M' }, { 'A', 'N' } };

		HashMap<Character, Integer> score = new HashMap<>();
		for (char[] personality : personalities) {
			score.put(personality[0], 0);
			score.put(personality[1], 0);
		}

		for (int i = 0; i < survey.length; i++) {
			if (choices[i] < 4)
				score.replace(survey[i].charAt(0), score.get(survey[i].charAt(0)) - choices[i] + 4);
			else if (choices[i] > 4)
				score.replace(survey[i].charAt(1), score.get(survey[i].charAt(1)) + choices[i] - 4);
		}

		String answer = "";
		for (char[] personality : personalities) {
			if (score.get(personality[0]) >= score.get(personality[1]))
				answer += personality[0];
			else
				answer += personality[1];
		}

		return answer;
	}
}