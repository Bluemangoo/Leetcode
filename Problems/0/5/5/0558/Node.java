class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
    }

    public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }

    private static String delLast(String ori) {
        return ori.substring(0, ori.length() - 1);
    }
    public String toString(){
        return "["+delLast(toString(true))+"]";
    }
    public String toString(boolean a) {
        if(a) {
            if (isLeaf) {
                return "[1," + (val ? "1" : "0") + "],";
            } else {
                return "[0," + (val ? "1" : "0") + "]," + (topLeft == null ? "" : topLeft.toString(true)) + (topRight == null ? "" : topRight.toString(true)) + (bottomLeft == null ? "" : bottomLeft.toString(true)) + (bottomRight == null ? "" : bottomRight.toString(true));
            }
        }
        else {
            if (isLeaf) {
                return "[1," + (val ? "1" : "0") + "],";
            } else {
                return (topLeft == null ? "" : topLeft.toString(true)) + (topRight == null ? "" : topRight.toString(true)) + (bottomLeft == null ? "" : bottomLeft.toString(true)) + (bottomRight == null ? "" : bottomRight.toString(true));
            }
        }
    }
};