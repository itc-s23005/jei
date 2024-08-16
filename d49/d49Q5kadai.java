// s23005
// d49Q5kadai

public class d49Q5kadai {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);
        int base3 = Integer.parseInt(args[3]);

        int common = base1 * base2;
        int common2 = base1 * base3;
        int common3 = base2 * base3;
        int common4 = base1 * base2 * base3;

        for (int i = 1; i <= limit; i++) {
            if (i % common4 == 0) {
                System.out.println(i + ":base1,base2,base3");
                continue;
            }
            if (i % common == 0) {
                System.out.println(i + ":base1,base2");
                continue;
            }
            if (i % common2 == 0) {
                System.out.println(i + ":base1,base3");
                continue;
            }
            if (i % common3 == 0) {
                System.out.println(i + ":base2,base3");
                continue;
            }
            if (i % base1 == 0) {
                System.out.println(i + ":base1");
                continue;
            }
            if (i % base2 == 0) {
                System.out.println(i + ":base2");
                continue;
            }
            if (i % base3 == 0) {
                System.out.println(i + ":base3");
                continue;
            }
            System.out.println(i);
        }
    }
}

