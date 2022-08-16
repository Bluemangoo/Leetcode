//Problem 1656
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                OrderedStream os = new OrderedStream(5);
                Print.print(os.insert(3, "ccccc"));
                Print.print(os.insert(1, "aaaaa"));
                Print.print(os.insert(2, "bbbbb"));
                Print.print(os.insert(5, "eeeee"));
                Print.println(os.insert(4, "ddddd"));
                System.out.println("[], [aaaaa], [bbbbb, ccccc], [], [ddddd, eeeee]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                OrderedStream os = new OrderedStream(5);
                Print.print(os.insert(2, "a"));
                Print.print(os.insert(3, "b"));
                Print.print(os.insert(1, "c"));
                Print.print(os.insert(4, "d"));
                Print.println(os.insert(5, "e"));
                System.out.println("[], [], [c, a, b], [d], [e]  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 2;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
