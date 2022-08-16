public class Print {
    private static StringBuilder buffer = new StringBuilder();

    public static <T> void print(T p) {
        buffer.append(p);
        buffer.append(", ");
    }

    public static <T> void println(T p) {
        buffer.append(p);
        System.out.println(buffer);
        buffer = new StringBuilder();
    }

    public static void println() {
        System.out.println(buffer);
        buffer = new StringBuilder();
    }
}
