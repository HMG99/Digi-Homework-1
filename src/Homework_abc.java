public class Homework_abc {
    public static void main(String aa[]) {

        int a = 2;
        int b = 4;
        int c = 6;

        // xndir 24
        if (a == 2 && b == 2 && c != 2 || a != 2 && b == 2 && c == 2 || a == 2 && b != 2 && c == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir 27

        if (a - b == b - c || a - c == c - b || b - a == a - c || b - c == c - a
                || c - a == a - b || c - b == b - a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir 28
        double a1 = 2;
        double b1 = 8;
        double c1 = 4;

        if (a1 / b1 == b1 / c1 || a1 / c1 == c1 / b1 || b1 / a1 == a1 / c1 || b1 / c1 == c1 / a1
                || c1 / a1 == a1 / b1 || c1 / b1 == b1 / a1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        //xndir 29

        if (a > b) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                if (c > a) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            }
        } else {
            if (c > b) {
                System.out.println(a + " " + b + " " + c);
            } else {
                if (c > a) {
                    System.out.println(a + " " + c + " " + b);
                } else {
                    System.out.println(c + " " + a + " " + b);
                }
            }
        }

        //xndir 30

        if (a > b) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                if (c > a) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            }
        } else {
            if (c > b) {
                System.out.println(c + " " + b + " " + a);
            } else {
                if (c > a) {
                    System.out.println(b + " " + c + " " + a);
                } else {
                    System.out.println(b + " " + a + " " + c);
                }
            }
        }


    }
}
