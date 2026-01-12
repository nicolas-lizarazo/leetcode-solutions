public class MergeStrings {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(Solution.mergeAlternately(word1, word2) + " Debería ser \"apbqcr\"");
    }

    public static class Solution {
        public static String mergeAlternately(String word1, String word2) {
            int i = 0, num1 = word1.length(), num2 = word2.length();
            StringBuilder merge = new StringBuilder();
            while(i < num1 || i < num2) {
                if ( i < num1 ) merge.append(word1.charAt(i));
                if ( i < num2 ) merge.append(word2.charAt(i));
                i++;
            }
            return merge.toString();
        }
    }
}

/*
    javac MergeStrings.java
    java Mergestrings.java
*/

