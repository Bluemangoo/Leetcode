//求解一个给定的方程，将x以字符串 "x=#value" 的形式返回。该方程仅包含 '+' ， '-' 操作，变量 x 和其对应系数。
//
// 如果方程没有解，请返回 "No solution" 。如果方程有无限解，则返回 “Infinite solutions” 。
//
// 题目保证，如果方程中只有一个解，则 'x' 的值是一个整数。
//
//
//
// 示例 1：
//
//
//输入: equation = "x+5-3+x=6+x-2"
//输出: "x=2"
//
//
// 示例 2:
//
//
//输入: equation = "x=x"
//输出: "Infinite solutions"
//
//
// 示例 3:
//
//
//输入: equation = "2x=x"
//输出: "x=0"
//
//
//
//
// 提示:
//
//
// 3 <= equation.length <= 1000
// equation 只有一个 '='.
// equation 方程由整数组成，其绝对值在 [0, 100] 范围内，不含前导零和变量 'x' 。
//
//
// Related Topics 数学 字符串 模拟 👍 132 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String solveEquation(String equation) {
        char[] charArray = equation.toCharArray();
        int multiplier = 0;
        int constant = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'x') {
                multiplier++;
                continue;
            }
            int j = i;
            boolean flagNegative = charArray[i] == '-';
            if (flagNegative && charArray[i + 1] == 'x') {
                i++;
                multiplier--;
                continue;
            }
            if (flagNegative || Character.isDigit(charArray[i])) {
                i++;
                while (i < charArray.length && Character.isDigit(charArray[i])) {
                    i++;
                }
                int sum = Integer.parseInt(equation.substring(j, i));
                if (i < charArray.length && charArray[i] == 'x') {
                    multiplier += sum;
                } else {
                    constant += sum;
                    i--;
                }
            } else if (charArray[i] == '=') {
                multiplier = -multiplier;
                constant = -constant;
            }
        }
        if (multiplier == 0) {
            if (constant == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        }
        if (constant == 0) {
            return "x=0";
        }
        return "x=" + (-(constant / multiplier));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
