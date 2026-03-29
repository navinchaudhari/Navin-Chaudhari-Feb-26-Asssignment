package inheritance;

public class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor " + name);

    }

    public Parent() {
    }

    static {
        System.out.println("Parent Static Block");
    }

    {
        System.out.println("Parent Instance block");
    }
}
