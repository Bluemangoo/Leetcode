//给定一个字符串 s 和一个整数 k 。你可以从 s 的前 k 个字母中选择一个，并把它加到字符串的末尾。
//
// 返回 在应用上述步骤的任意数量的移动后，字典上最小的字符串 。
//
//
//
// 示例 1：
//
//
//输入：s = "cba", k = 1
//输出："acb"
//解释：
//在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
//在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。
//
//
// 示例 2：
//
//
//输入：s = "baaca", k = 3
//输出："aaabc"
//解释：
//在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
//在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。
//
//
//
//
// 提示：
//
//
// 1 <= k <= S.length <= 1000
// s 只由小写字母组成。
//
//
// Related Topics 数学 字符串 排序 👍 82 👎 0

//脑筋急转弯啊同志，k>=2就一定可以排出来，k==1就只要取最小就行。

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String orderlyQueue(String s, int k) {
        if (k > 1 || s.length() == 2) {
            char[] ans = s.toCharArray();
            Arrays.sort(ans);
            return String.valueOf(ans);
        }
        if (s.length() < 2) {
            return s;
        }
        int[] n = new int[s.length() + 1];
        Arrays.fill(n, -1);
        int j = 0;
        char c = Character.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < c) {
                j = 0;
                Arrays.fill(n, -1);
                n[j++] = i;
                c = s.charAt(i);
                continue;
            }
            if (s.charAt(i) == c) {
                n[j++] = i;
            }
        }
        String ans = null;
        for (int i = 0; i < n.length && n[i] != -1; i++) {
            String now = s.substring(n[i]) + s.substring(0, n[i]);
            if (ans == null) {
                ans = now;
                continue;
            }
            if (ans.compareTo(now) > 0) {
                ans = now;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
