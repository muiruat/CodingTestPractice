class Solution {
	public String solution(int a, int b) {
		String[] dayOfTheWeek = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] daysOfMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int days = 0;
		for (int i = 0; i < a - 1; i++)
			days += daysOfMonth[i];

		days += b - 1;

		String answer = dayOfTheWeek[days % 7];
		return answer;
	}
}