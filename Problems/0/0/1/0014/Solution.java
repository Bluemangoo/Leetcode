//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
//
// Related Topics 字符串 👍 2332 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        if (strs.length == 1) {
            return strs[0];
        }
        for (String string : strs) {
            for (int i = 0; i < common.length(); i++) {
                if (string.length() < i + 1) {
                    common = common.substring(0, i);
                    break;
                }
                if (common.charAt(i) != string.charAt(i)) {
                    common = common.substring(0, i);
                    break;
                }
            }
            if (common.length() == 0) {
                break;
            }
        }
        return common;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
