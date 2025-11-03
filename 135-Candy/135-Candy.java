// Last updated: 3/11/2025, 10:01:31 pm
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0) return 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < n; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += Math.max(left[i], right[i]);
        }
        return ans;
    }
}