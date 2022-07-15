//Problem 0676
public class Start {
    static MagicDictionary magicDictionary = new MagicDictionary();
    private static void test(int count){
        switch (count) {
            case 1:{
                System.out.println("test 1 start:");
                System.out.println(magicDictionary.search("hello"));
                System.out.println("Should be: false\n");
                break;
            }
            case 2:{
                System.out.println("test 2 start:");
                System.out.println(magicDictionary.search("hhllo"));
                System.out.println("Should be: true\n");
                break;
            }
            case 3:{
                System.out.println("test 3 start:");
                System.out.println(magicDictionary.search("hell"));
                System.out.println("Should be: false\n");
                break;
            }
            case 4:{
                System.out.println("test 4 start:");
                System.out.println(magicDictionary.search("leetcoded"));
                System.out.println("Should be: false\n");
                break;
            }
            default:{
                System.err.println("Too More Tests");
            }
        }
    }
    public static void main(String[] args) {
        magicDictionary.buildDict(new String[]{"hello", "leetcode"});
        int testTime = 4;
        for (int i=1;i<=testTime;i++){
            test(i);
        }
    }
}
