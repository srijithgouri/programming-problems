package Bantolabs;


public class SubSequence {
  
    public static void main(String[] args) {
        String A1 = "AXY";
        String B1 = "YADXCP";
        System.out.println("Output for A1: " + isSubsequence(A1, B1)); // Output: false

        String A2 = "gksrek";
        String B2 = "geeksforgeeks";
        System.out.println("Output for A2: " + isSubsequence(A2, B2)); // Output: true
    }
    public static boolean isSubsequence(String A, String B) {
        int m = A.length();
        int n = B.length();
        
        int i = 0; // Index for string A
        int j = 0; // Index for string B
        
        // Traverse both strings
        while (i < m && j < n) {
            // If current characters match, move to next character in A
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            // Move to next character in B
            j++;
        }
        
        // If all characters of A were found in B in order
        return (i == m);
    }
}
	
	

	


