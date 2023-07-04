public class Homework31_40 {
    public static void main(String aa[]) {

        int a = 10;
        int b = 21;
        int c = 30;
        int d = 40;


        //xndir 31

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else if (d > a && d > b && d > c) {
            System.out.println(d);
        }

        //xndir 32

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else if (d < a && d < b && d < c) {
            System.out.println(d);
        }

        //xndir 33
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir 34
        if (a + b == c + d || a + c == b + d || a + d == c + b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir 35
        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir 36
        int count = 0;
        if (a % 2 == 1) count++;
        if (b % 2 == 1) count++;
        if (c % 2 == 1) count++;
        if (d % 2 == 1) count++;
        System.out.println((count >= 2) ? 1 : 2);




    }
}
