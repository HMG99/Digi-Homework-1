public class Homework51_60 {
    public static void main(String aa[]) {
        boolean t;
        int num = 345;

        //xndir 51

        int x = num / 100;
        int y = (num - x * 100) / 10;
        int z = num % 10;

        if (z == x + y) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //xndir 52

        if (x == y || x == z || y == z) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //xndir 53

        int tt = 400;

        if (num > tt) {
            System.out.println(num / (x + y + z));
        } else {
            System.out.println((double) z / num);
        }

        //xndir 54

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else if (z > x && z > y) {
            System.out.println(z);
        }

        //xndir 55

        if (x < y && x < z) {
            System.out.println(x);
        } else if (y < x && y < z) {
            System.out.println(y);
        } else if (z < x && z < y) {
            System.out.println(z);
        }

        //xndir 56

        if (z > y) {
            System.out.println((double) (x + y + z) / num);
        } else {
            System.out.println(num);
        }

        //xndir 57

        if (num > 300 && z != 0) {
            System.out.println((double) y / z);
        } else {
            System.out.println((double) x / z);
        }

        //xndir 58
        char f;

        if (x + y < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);

        //xndir 59
        if (x > y) {
            if (y > z) {
                System.out.println(z + " " + y + " " + x);
            } else {
                if (x > z) {
                    System.out.println(y + " " + z + " " + x);
                } else {
                    System.out.println(y + " " + x + " " + z);
                }
            }
        } else {
            if (x > z) {
                System.out.println(z + " " + x + " " + y);
            } else {
                if (y > z) {
                    System.out.println(x + " " + z + " " + y);
                } else {
                    System.out.println(x + " " + y + " " + z);
                }
            }
        }


        //xndir 60
        if (x > y) {
            if (y > z) {
                System.out.println(x + " " + y + " " + z);
            } else {
                if (x > z) {
                    System.out.println(x + " " + z + " " + y);
                } else {
                    System.out.println(z + " " + x + " " + y);
                }
            }
        } else {
            if (x > z) {
                System.out.println(y + " " + x + " " + z);
            } else {
                if (y > z) {
                    System.out.println(y + " " + z + " " + x);
                } else {
                    System.out.println(z + " " + y + " " + x);
                }
            }
        }

    }
}
