//Problem 0558

public class Start {
    private static Node makeNode(int[] val) {
        Node topLeft = new Node();
        Node topRight = new Node();
        Node bottomLeft = new Node();
        Node bottomRight = new Node();

        if (val[0] == 0) {
            topLeft.isLeaf = val[2] == 1;
            topLeft.val = val[3] == 1;
            topRight.isLeaf = val[4] == 1;
            topRight.val = val[5] == 1;
            bottomLeft.isLeaf = val[6] == 1;
            bottomLeft.val = val[7] == 1;
            bottomRight.isLeaf = val[8] == 1;
            bottomRight.val = val[9] == 1;
        }
        return new Node(val[1] == 1, val[0] == 1, topLeft, topRight, bottomLeft, bottomRight);
    }

    private static Node makeNode(int[] val, int[] child) {
        Node out = makeNode(val);
        int n = 0;
        if (!out.topLeft.isLeaf) {
            out.topLeft = makeNode(new int[]{0, 1, child[0], child[1], child[2], child[3], child[4], child[5], child[6], child[7]});
            n++;
        }
        if (!out.topRight.isLeaf) {
            out.topRight = makeNode(new int[]{0, 1, child[8 * n], child[8 * n + 1], child[8 * n + 2], child[8 * n + 3], child[8 * n + 4], child[8 * n + 5], child[8 * n + 6], child[8 * n + 7]});
            n++;
        }
        if (!out.bottomLeft.isLeaf) {
            out.bottomLeft = makeNode(new int[]{0, 1, child[8 * n], child[8 * n + 1], child[8 * n + 2], child[8 * n + 3], child[8 * n + 4], child[8 * n + 5], child[8 * n + 6], child[8 * n + 7]});
            n++;
        }
        if (!out.bottomRight.isLeaf) {
            out.bottomRight = makeNode(new int[]{0, 1, child[8 * n], child[8 * n + 1], child[8 * n + 2], child[8 * n + 3], child[8 * n + 4], child[8 * n + 5], child[8 * n + 6], child[8 * n + 7]});
        }
        return out;
    }


    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test 1 start:");
                Node quadTree1In = makeNode(new int[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 0});
                Node quadTree2In = makeNode(new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0}, new int[]{1, 0, 1, 0, 1, 1, 1, 1});
                System.out.println(new Solution().intersect(quadTree1In, quadTree2In));
                System.out.println("[[0,-],[1,1],[1,1],[1,1],[1,0]]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test 2 start:");
                Node quadTree1In = makeNode(new int[]{1, 0});
                Node quadTree2In = makeNode(new int[]{1, 0});
                System.out.println(new Solution().intersect(quadTree1In, quadTree2In));
                System.out.println("[[1,0]]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test 3 start:");
                Node quadTree1In = makeNode(new int[]{0, 0, 1, 0, 1, 0, 1, 1, 1, 1});
                Node quadTree2In = makeNode(new int[]{0, 0, 1, 1, 1, 1, 1, 0, 1, 1});
                System.out.println(new Solution().intersect(quadTree1In, quadTree2In));
                System.out.println("[[1,1]]  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test 4 start:");
                Node quadTree1In = makeNode(new int[]{0,0,1,1,1,0,1,1,1,1});
                Node quadTree2In = makeNode(new int[]{0,0,1,1,0,1,1,1,1,1}, new int[]{1,1,1,0,1,0,1,1});
                System.out.println(new Solution().intersect(quadTree1In, quadTree2In).toString());
                System.out.println("[[0,-],[1,1],[0,-],[1,1],[1,0],[1,0],[1,1],[1,1],[1,1]]  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test 5 start:");
                Node quadTree1In = makeNode(new int[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 0}, new int[]{1, 0, 1, 0, 1, 1, 1, 1});
                Node quadTree2In = makeNode(new int[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 0}, new int[]{1, 0, 1, 0, 1, 1, 1, 1});
                System.out.println(new Solution().intersect(quadTree1In, quadTree2In));
                System.out.println("[[0,-],[0,-],[1,0],[1,0],[1,1],[1,1],[0,-],[1,0],[1,0],[1,1],[1,1],[1,1],[1,0]]  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 5;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
