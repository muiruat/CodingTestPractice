import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		List<String> reports = Arrays.stream(report).distinct().collect(Collectors.toList()); // 중복 신고 제거한 리스트

		HashMap<String, Integer> counts = new HashMap<>(); // 신고 받은 횟수 저장하는 해쉬맵
		reports.stream().forEach(rep -> {
			String reportee = rep.split(" ")[1];
			counts.put(reportee, counts.getOrDefault(reportee, 0) + 1); // 신고 받은 횟수 저장
		});

		return Arrays.stream(id_list).map(id -> reports.stream().filter(rep -> rep.startsWith(id + " "))
				.filter(rep -> counts.get(rep.split(" ")[1]) >= k).count()).mapToInt(Long::intValue).toArray();
	}
}