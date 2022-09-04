import java.util.HashMap;
import java.util.HashSet;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		HashMap<String, Integer> reporters = new HashMap<>();
		for (String id : id_list)
			reporters.put(id, 0);

		HashMap<String, Integer> reportees = new HashMap<>();
		for (String id : id_list)
			reportees.put(id, 0);

		HashSet<String> reports = new HashSet<>();
		for (String rep : report)
			reports.add(rep);

		for (String rep : reports) {
			String reportee = rep.split(" ")[1];
			reportees.replace(reportee, reportees.get(reportee) + 1);
		}

		for (String rep : reports) {
			String[] reportSplit = rep.split(" ");
			String reporter = reportSplit[0];
			String reportee = reportSplit[1];

			if (reportees.get(reportee) >= k)
				reporters.replace(reporter, reporters.get(reporter) + 1);
		}

		int[] answer = new int[id_list.length];
		int index = 0;
		for (String id : id_list)
			answer[index++] = reporters.get(id);

		return answer;
	}
}