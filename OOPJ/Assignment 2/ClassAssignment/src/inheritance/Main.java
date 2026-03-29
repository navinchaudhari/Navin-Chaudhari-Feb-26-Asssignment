package inheritance;

public class Main {

    static void changeData(Parent p) {
        p.name = "Bhavesh";
    }

    static void changePrimitiveData(int i) {
        i = 15;
    }

    public static void main(String[] args) {
//        Child c = new Child("Navin");
        int num = 10;
        System.out.println("Before num: " + num);
        changePrimitiveData(num);
        System.out.println("Before num: " + num);

        Parent p = new Parent("Navin");
        System.out.println("Before change: " + p.name);
        changeData(p);
        System.out.println("Before change: " + p.name);


    }
}
