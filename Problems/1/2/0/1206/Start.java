//Problem 1206
public class Start {
    private static void test(int count) {
        switch (count) {
            case 1: {
                System.out.println("test " + count + " start:");
                Skiplist skiplist = new Skiplist();
                skiplist.add(1);
                skiplist.add(2);
                skiplist.add(3);
                System.out.print(skiplist.search(0));   //1
                System.out.print(", ");
                skiplist.add(4);
                System.out.print(skiplist.search(1));   //2
                System.out.print(", ");
                System.out.print(skiplist.erase(0));     //3
                System.out.print(", ");
                System.out.print(skiplist.erase(1));     //4
                System.out.print(", ");
                System.out.println(skiplist.search(1));//5
                System.out.println("false, true, false, true, false  <-  Should be\n");
                break;
            }
            default: {
                System.err.println("Too More Tests");
                System.exit(-1);
            }
        }
    }

    public static void main(String[] args) {
        int testTime = 1;
        for (int i = 1; i <= testTime; i++) {
            test(i);
        }
    }
}
