public class d52Q5kadai {
    public static void main(String[] args) {
        String majors = "+----+----+----+----+----";
        int LIMIT = 400;
        if (args.length == 0) return;
        int max = 0, i = 0;
        int[] data = new int[args.length];

        // コマンドライン引数を整数に変換して配列に格納し、最大値を取得
        for (String s : args) {
            data[i] = Integer.parseInt(s);
            if (data[i] <= 0 || data[i] >= LIMIT) return;
            if (max < data[i]) {
                max = data[i];
            }
            i++;
        }

        int majormax = (max - 1) / 10 + 1;
        System.out.print("  ");
        // ヘッダーを修正して適切な長さにする
        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % majors.length()));
        }
        System.out.println("");

        // 各値に対応する行を出力
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 10 + 1;  // アスタリスクの数を調整
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}

