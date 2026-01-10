/**
 * Solution for LeetCode #1: Two Sum
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

function twoSum(nums: number[], target: number): number[] {
    const seen = new Map();
    for (const [index, num] of nums.entries()) {
        let complement = target - num;
        if ( seen.has(complement) ) {
            return [ seen.get(complement), index ];
        }
        seen.set( num, index );
    }
    return [];
};