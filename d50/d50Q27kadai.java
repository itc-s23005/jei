// s23005
//
// Q27の課題のアレンジ
//

class d50Q27kadai {
    public static void main(String[] args) {
        int ans = Integer.parseInt(args[0]);
        String mode;

        switch (ans) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            default:
                mode = "Wind";
                break;
        }

        System.out.println(mode);
    }
}

