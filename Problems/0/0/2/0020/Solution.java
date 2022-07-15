//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
//
//
// 示例 1：
//
//
//输入：s = "()"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "()[]{}"
//输出：true
//
//
// 示例 3：
//
//
//输入：s = "(]"
//输出：false
//
//
// 示例 4：
//
//
//输入：s = "([)]"
//输出：false
//
//
// 示例 5：
//
//
//输入：s = "{[]}"
//输出：true
//
//
//
// 提示：
//
//
// 1 <= s.length <= 10⁴
// s 仅由括号 '()[]{}' 组成
//
//
// Related Topics 栈 字符串 👍 3382 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stack.append(i);
            } else {
                if (stack.length() < 1) {
                    return false;
                }
                switch (i) {
                    case ')': {
                        if (stack.charAt(stack.length() - 1) == '(') {
                            stack.deleteCharAt(stack.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    }
                    case '}': {
                        if (stack.charAt(stack.length() - 1) == '{') {
                            stack.deleteCharAt(stack.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    }
                    case ']': {
                        if (stack.charAt(stack.length() - 1) == '[') {
                            stack.deleteCharAt(stack.length() - 1);
                        } else {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return stack.length() == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
