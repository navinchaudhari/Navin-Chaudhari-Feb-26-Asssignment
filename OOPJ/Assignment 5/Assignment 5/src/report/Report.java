package report;

public class Report<T> {

    static <T> void print(String title, T[] t) {
        System.out.println("** " + title + " **");
        for (T i : t) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
