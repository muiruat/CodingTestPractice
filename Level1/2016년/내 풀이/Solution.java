import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
	public String solution(int a, int b) {
		String[] dayOfTheWeek = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

		LocalDate date = LocalDate.of(2016, a, b);
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		String answer = dayOfTheWeek[dayOfWeek.getValue() - 1];
		return answer;
	}
}