

public class Solution3 {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String comp = "";

		for (int i = 0; i < s.length() - k + 1; i++) {
			comp = s.substring(i, i + k);
			if (i == 0) {
				smallest = s.substring(0, k);
				largest = s.substring(0, k);
			} else {
				for (int a = 0; a < k; a++) {
					if (smallest.charAt(a) == comp.charAt(a))
						continue;
					else if (smallest.charAt(a) > comp.charAt(a)) {
						smallest = comp;
						break;
					} else if (smallest.charAt(a) < comp.charAt(a))
						break;
				}

				for (int b = 0; b < k; b++) {
					if (largest.charAt(b) == comp.charAt(b))
						continue;
					else if (largest.charAt(b) < comp.charAt(b)) {
						largest = comp;
						break;
					} else if (largest.charAt(b) > comp.charAt(b))
						break;
				}
			}
		}

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int k = 30;

		System.out.println(getSmallestAndLargest(s, k));
	}
}