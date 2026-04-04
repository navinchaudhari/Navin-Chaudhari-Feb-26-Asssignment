class Test {

    static int num(int a) {
        try {
            if (a > 0) {
                int x = a / 0;
                return 1;
            } else {
                return 1;
            }
        } catch (Exception e) {
            return 1;
        } finally {
            return 1;
        }
    }

    public static void main(String[] args) {
//        System.out.println(num(0));
        Integer i1 = 200;
        Integer i2 = 200;
        System.out.println(i1==i2);

    }
}