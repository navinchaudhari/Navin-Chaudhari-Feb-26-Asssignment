public class Demo {

    static <T extends Number, M extends Number> void sum(T t, M m) {
        System.out.println(t.doubleValue() + m.doubleValue());
    }

    public static void main(String[] args) {
        sum(25.36,56.0);
        sum(14,58);
    }
}
