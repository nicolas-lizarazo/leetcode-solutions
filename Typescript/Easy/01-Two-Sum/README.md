# LeetCode Solutions: Two Sum

This repository contains my optimized solution for the **Two Sum** problem from LeetCode.

## 🚀 Problem Description

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

* **Difficulty:** Easy
* **Link:** [Two Sum - LeetCode](https://leetcode.com/problems/two-sum/)

---

## 🛠️ My Approach: One-Pass Hash Map

I implemented the **One-Pass Hash Map** technique. Instead of checking every possible pair, I use a `Map` to store the numbers I have already encountered and their respective indices.

### Key Logic:
1.  As I iterate through the array, I calculate the `complement` needed to reach the `target` ($complement = target - current\_value$).
2.  I check if the `complement` already exists in my `Map`.
3.  If it exists, I found the answer and return the stored index and the current index.
4.  If not, I store the current number in the `Map` and continue.



---

## ⚖️ Efficiency Comparison

### Brute Force Approach
* **Method:** Uses two nested `for` loops to compare every element with every other element.
* **Time Complexity:** $O(n^2)$ - Extremely slow as the input size grows.
* **Space Complexity:** $O(1)$ - Minimal memory usage, but inefficient performance.

### My Optimized Solution
* **Method:** Uses a single pass with a Hash Map.
* **Time Complexity:** $O(n)$ - **Beats 100% of users (0 ms)**.
* **Space Complexity:** $O(n)$ - Uses extra memory to store seen values for $O(1)$ lookup speed.

---

## 📊 Performance (LeetCode Results)

| Metric | Result | Rank |
| :--- | :--- | :--- |
| **Runtime** | 0 ms | **Beats 100.00%** |
| **Memory** | 60.18 MB | Top Efficiency Rank |

---

## 💻 Code Snippet (TypeScript)

```typescript
/**
 * One-Pass Hash Map Solution
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
function twoSum(nums: number[], target: number): number[] {
    const seen = new Map<number, number>();

    for (const [index, num] of nums.entries()) {
        const complement = target - num;

        // Check if the complement was already seen
        if (seen.has(complement)) {
            return [seen.get(complement)!, index];
        }

        // Store current number and its index
        seen.set(num, index);
    }
    
    return [];
}