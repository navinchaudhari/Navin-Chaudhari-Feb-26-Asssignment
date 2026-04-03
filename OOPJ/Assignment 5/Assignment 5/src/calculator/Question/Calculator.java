package calculator.Question;

public class Calculator {

    static <T extends Number> double sum(T[] t) {
        double sum = 0;
        for (T i : t) {
            sum += i.doubleValue();
        }

        return sum;
    }

    static <T extends Number> double avg(T[] t) {
        return sum(t) / t.length;
    }
}
