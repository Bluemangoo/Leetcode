import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem 0636
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                int nIn = 2;
                List<String> logsIn = new ArrayList<>(List.of(new String[]{"0:start:0", "1:start:2", "1:end:5", "0:end:6"}));
                System.out.println(Arrays.toString(new Solution().exclusiveTime(nIn, logsIn)));
                System.out.println("[3, 4]  <-  Should be\n");
                break;
            }
            case 2: {
                System.out.println("test " + count + " start:");
                int nIn = 1;
                List<String> logsIn = new ArrayList<>(List.of(new String[]{"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"}));
                System.out.println(Arrays.toString(new Solution().exclusiveTime(nIn, logsIn)));
                System.out.println("[8]  <-  Should be\n");
                break;
            }
            case 3: {
                System.out.println("test " + count + " start:");
                int nIn = 2;
                List<String> logsIn = new ArrayList<>(List.of(new String[]{"0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7"}));
                System.out.println(Arrays.toString(new Solution().exclusiveTime(nIn, logsIn)));
                System.out.println("[7, 1]  <-  Should be\n");
                break;
            }
            case 4: {
                System.out.println("test " + count + " start:");
                int nIn = 2;
                List<String> logsIn = new ArrayList<>(List.of(new String[]{"0:start:0", "0:start:2", "0:end:5", "1:start:7", "1:end:7", "0:end:8"}));
                System.out.println(Arrays.toString(new Solution().exclusiveTime(nIn, logsIn)));
                System.out.println("[8, 1]  <-  Should be\n");
                break;
            }
            case 5: {
                System.out.println("test " + count + " start:");
                int nIn = 1;
                List<String> logsIn = new ArrayList<>(List.of(new String[]{"0:start:0", "0:end:0"}));
                System.out.println(Arrays.toString(new Solution().exclusiveTime(nIn, logsIn)));
                System.out.println("[1]  <-  Should be\n");
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
