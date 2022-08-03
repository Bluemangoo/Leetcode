# 0899. 有序队列

## 思路

脑筋急转弯啊！

当 k >= 2 时一定可以排出来，直接排序字符串就可以。

当 k == 1 时遍历一遍找最小就行。

我做了一个优化：先把字符串里面的最小字符找出来，然后再遍历这几个字符串找最小。

另外，把 `s.length() == 1` 的情况直接输出；

把 `s.length() == 2` 的情况直接排序。

![0899.png](https://pic.leetcode-cn.com/1659491150-vaUToo-899.png)

## 代码：

```java
class Solution {
    public String orderlyQueue(String s, int k) {
        if (k>1||s.length()==2){
            char[] ans=s.toCharArray();
            Arrays.sort(ans);
            return String.valueOf(ans);
        }
        if (s.length()<2){
            return s;
        }
        int[] n = new int[s.length() + 1];
        Arrays.fill(n,-1);
        int j = 0;
        char c = Character.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < c) {
                j = 0;
                Arrays.fill(n,-1);
                n[j++] = i;
                c=s.charAt(i);
                continue;
            }
            if (s.charAt(i) == c) {
                n[j++] = i;
            }
        }
        String ans = null;
        for (int i=0;i<n.length&&n[i]!=-1;i++) {
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
```