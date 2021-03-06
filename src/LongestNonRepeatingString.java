import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingString {

	public static void main(String[] args) {
		String test = "abcdacabcdeess";
		int length = lengthOfLongestSubstring(test);
		System.out.println(length);

	}

	// public static int lengthOfLongestSubstring(String s) {
	// int n = s.length();
	// Set<Character> set = new HashSet<>();
	// int ans = 0, i = 0, j = 0;
	// while (i < n && j < n) {
	// if (!set.contains(s.charAt(j))) {
	// set.add(s.charAt(j++));
	// ans = Math.max(ans, j - i);
	//
	// } else {
	// set.remove(s.charAt(i++));
	// }
	// }
	// return ans;
	// }

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of
														// character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				System.out.println("this is " + s.charAt(j));
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			System.out.println("i-> " + i + " j-> " + j + " ans-> " + ans + " map-> " + map);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

}
