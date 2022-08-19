//给定一个表示分数加减运算的字符串 expression ，你需要返回一个字符串形式的计算结果。
//
// 这个结果应该是不可约分的分数，即最简分数。 如果最终结果是一个整数，例如 2，你需要将它转换成分数形式，其分母为 1。所以在上述例子中, 2 应该被转换为
// 2/1。
//
//
//
// 示例 1:
//
//
//输入: expression = "-1/2+1/2"
//输出: "0/1"
//
//
// 示例 2:
//
//
//输入: expression = "-1/2+1/2+1/3"
//输出: "1/3"
//
//
// 示例 3:
//
//
//输入: expression = "1/3-1/2"
//输出: "-1/6"
//
//
//
//
// 提示:
//
//
// 输入和输出字符串只包含 '0' 到 '9' 的数字，以及 '/', '+' 和 '-'。
// 输入和输出分数格式均为 ±分子/分母。如果输入的第一个分数或者输出的分数是正数，则 '+' 会被省略掉。
// 输入只包含合法的最简分数，每个分数的分子与分母的范围是 [1,10]。 如果分母是1，意味着这个分数实际上是一个整数。
// 输入的分数个数范围是 [1,10]。
// 最终结果的分子与分母保证是 32 位整数范围内的有效整数。
//
//
// Related Topics 数学 字符串 模拟 👍 92 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String fractionAddition(String expression) {
        int[][] nums = new int[10][2];
        int k = 0;
        int isDenominator = 0;
        boolean isPositive = true;
        if (expression.charAt(0) == '-') {
            k--;
        }
        for (char i : expression.toCharArray()) {
            if (i == '-') {
                if (!isPositive) {
                    nums[k][0] = -nums[k][0];
                }
                isDenominator = 0;
                isPositive = false;
                k++;
                continue;
            }
            if (i == '+') {
                if (!isPositive) {
                    nums[k][0] = -nums[k][0];
                }
                isDenominator = 0;
                isPositive = true;
                k++;
                continue;
            }
            if (i == '/') {
                isDenominator = 1;
                continue;
            }
            nums[k][isDenominator] = nums[k][isDenominator] * 10 + i - '0';
        }
        if (!isPositive) {
            nums[k][0] = -nums[k][0];
        }
        int numerator = 0;
        int denominator = 1;
        for (int i = 0; i <= k; i++) {
            numerator *= nums[i][1];
            numerator += nums[i][0] * denominator;
            denominator *= nums[i][1];
        }
        if (numerator == 0) {
            return "0/1";
        }
        for (int i : new int[]{2, 3, 5, 7}) {
            while (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        return String.valueOf(numerator) + '/' + denominator;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
