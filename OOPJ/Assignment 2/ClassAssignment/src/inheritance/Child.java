package inheritance;

public class Child extends Parent {
    String name;

    public Child(String name) {
        super(name);
        this.name = name;
        System.out.println("Child Constructor " + name);

    }

    public Child() {
    }

    static {
        System.out.println("Child Static Block");
    }

    {
        System.out.println("Child Instance block");
    }
}
