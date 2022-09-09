import java.util.HashSet;

class Solution {
	public int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : nums)
			set.add(num);

		int answer = nums.length / 2 > set.size() ? set.size() : nums.length / 2;
		return answer;
	}
}