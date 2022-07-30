//给定一个由不同正整数的组成的非空数组 nums ，考虑下面的图：
//
//
// 有 nums.length 个节点，按从 nums[0] 到 nums[nums.length - 1] 标记；
// 只有当 nums[i] 和 nums[j] 共用一个大于 1 的公因数时，nums[i] 和 nums[j]之间才有一条边。
//
//
// 返回 图中最大连通组件的大小 。
//
//
//
//
//
//
// 示例 1：
//
//
//
//
//输入：nums = [4,6,15,35]
//输出：4
//
//
// 示例 2：
//
//
//
//
//输入：nums = [20,50,9,63]
//输出：2
//
//
// 示例 3：
//
//
//
//
//输入：nums = [2,3,6,7,4,12,21,39]
//输出：8
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 2 * 10⁴
// 1 <= nums[i] <= 10⁵
// nums 中所有值都 不同
//
//
// Related Topics 并查集 数组 数学 👍 100 👎 0

//Solution of capital-worker

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static int n = (int) 1e5 + 7;
    public static int[] isPrime = new int[n];
    public static int[] primes = new int[n];
    //并查集
    public static int[] parent = new int[n];
    int k = 0;

    public int largestComponentSize(int[] nums) {
        //欧拉筛，找出1-n的所有质数
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 0) {
                primes[k++] = i;
            }
            for (int j = 0; primes[j] * i < n; j++) {
                isPrime[primes[j] * i] = 1;
                if (i % primes[j] == 0) {
                    break;
                }
            }
        }
        //初始化并查集
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        //遍历nums中的每个数,和他们的质因数连接
        for (int num : nums) {
            int quotient = num;
            for (int j = 0; j < k && primes[j] * primes[j] <= quotient; j++) {
                if (quotient % primes[j] == 0) {
                    //primes[i]是他的质因数
                    union(num, primes[j]);
                    while (quotient % primes[j] == 0) {
                        quotient /= primes[j];
                    }
                }
            }
            //假如剩下了一个质因数，也和num连接，使得不同的质因数可以联合到一起
            //这种情况是因为 num是一个合数 由不同的质因数相乘组成 把他的质因数 连接起来
            if (quotient > 1) {
                union(quotient, num);
            }
        }
        int[] cnt = new int[n];
        int ans = 0;
        //是否属于某个根
        for (int num : nums) {
            ans = Math.max(ans, ++cnt[find(num)]);
        }
        return ans;
    }

    public void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);

        if (parentX != parentY) {
            parent[parentX] = parentY;
        }
    }

    public int find(int x) {
        // 采用路径压缩
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }
}

//leetcode submit region end(Prohibit modification and deletion)
