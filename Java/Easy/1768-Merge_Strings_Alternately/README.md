# LeetCode Solutions: Merge Strings Alternately

This repository contains my optimized solution for the **Merge Strings Alternately** problem from LeetCode.

## 🚀 Problem Description

You are given two strings `word1` and `word2`. Merge the strings by adding characters in alternating order, starting with `word1`. If one string is longer than the other, append the remaining characters at the end of the merged string.

- **Difficulty:** Easy  
- **Link:** [Merge Strings Alternately - LeetCode](https://leetcode.com/problems/merge-strings-alternately)

---

## 🛠️ Approach: While Loop

I implemented a solution using a **while loop** combined with a `StringBuilder` to achieve low memory usage and efficient string concatenation.

### Key Logic

1. Initialize a pointer `i` to iterate through both strings.
2. Use a `StringBuilder` to efficiently build the merged string.
3. While `i` is less than the length of either string:
   - Append the character from `word1` if `i` is within its bounds.
   - Append the character from `word2` if `i` is within its bounds.
4. Convert the `StringBuilder` to a `String` and return the result.

---

## ⚖️ Alternative Attempt

Before reaching this solution, I tried a different approach where I:

- Calculated the minimum length of both strings.
- Used a `for` loop to merge characters up to that length.
- Appended the remaining characters using substring operations.

Although this approach worked, it was more complex and did not provide better performance or memory efficiency compared to the final solution.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)` where `n` is the length of the longer string.
- **Space Complexity:** `O(n)` due to the `StringBuilder`.

---

## 📊 Performance (LeetCode Results)

| Metric | Result | Rank |
| :--- | :--- | :--- |
| **Runtime** | 1 ms | **Beats 95.20%** |
| **Memory** | 42.7 MB | Top Efficiency Rank |

---

## 💻 Code Snippet (Java)

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder merged = new StringBuilder();

        while (i < len1 || i < len2) {
            if (i < len1) merged.append(word1.charAt(i));
            if (i < len2) merged.append(word2.charAt(i));
            i++;
        }

        return merged.toString();
    }
}
```

## ▶️ How to Run the Code

### Option 1: Run locally (Java)

1. Make sure you have **Java 8 or higher** installed:
   ```bash
   java -version
   ```

2. Create a file called `Solution.java` and paste the solution code inside it.

3. Create a `Main.java` file for local testing:
   ```java
   public class Main {
       public static void main(String[] args) {
           Solution solution = new Solution();
           System.out.println(solution.mergeAlternately("abc", "pqr"));
           System.out.println(solution.mergeAlternately("ab", "pqrs"));
       }
   }
   ```

4. Compile and run:
   ```bash
   javac Main.java Solution.java
   java Main
   ```

---

### Option 2: Run on LeetCode

1. Go to the problem page:  
   [Merge Strings Alternately - LeetCode](https://leetcode.com/problems/merge-strings-alternately)

2. Select **Java** as the programming language.

3. Paste the `Solution` class into the editor.

4. Click **Run** or **Submit**.

---

## ✅ Expected Output

```text
apbqcr
apbqrs
```

---

## 🧪 Example

```text
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
```

---

## ⭐ Notes

- This solution runs in a single pass.
- `StringBuilder` avoids unnecessary string allocations.
- The approach is clean, readable, and interview-friendly.