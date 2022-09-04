import java.util.HashMap;

class Solution {
	public String solution(String[] survey, int[] choices) {
		char[] personalities = { 'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N' };
		HashMap<Character, Integer> score = new HashMap<>();
		String answer = "";

		for (int i = 0; i < personalities.length; i++)
			score.put(personalities[i], 0);

		for (int i = 0; i < survey.length; i++) {
			if (choices[i] < 4)
				score.put(survey[i].charAt(0), score.get(survey[i].charAt(0)) - choices[i] + 4);
			else if (choices[i] > 4)
				score.put(survey[i].charAt(1), score.get(survey[i].charAt(1)) + choices[i] - 4);
		}

		if (score.get('R') >= score.get('T'))
			answer += 'R';
		else
			answer += 'T';

		if (score.get('C') >= score.get('F'))
			answer += 'C';
		else
			answer += 'F';

		if (score.get('J') >= score.get('M'))
			answer += 'J';
		else
			answer += 'M';

		if (score.get('A') >= score.get('N'))
			answer += 'A';
		else
			answer += 'N';

		return answer;
	}
}