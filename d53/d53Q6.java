public class d53Q6 {
    private static String hex = "0123456789ABCDEF";

    public static void main(String[] args) {
        if (args.length != 5) {
            return;
        }

        if (args[0].equals("b")) {
            for (int i = 1; i <= 4; i++) {
                int num = hex.indexOf(args[i]);
                System.out.println(intToStr(num));
            }
        } else if (args[0].equals("g")) {
            for (int i = 1; i <= 4; i++) {
                System.out.println(strToInt(args[i]));
            }
        }
    }

    public static String intToStr(int x) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            if (x % 2 == 0) {
                s = "." + s;
            } else {
                s = "o" + s;
            }
            x /= 2;
        }
        return s;
    }

    public static String strToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sum += x;
            }
            x *= 2;
        }
        return Integer.toString(sum);
    }
}

