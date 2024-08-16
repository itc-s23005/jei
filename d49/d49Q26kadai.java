// s23005
// d49Q26kadai

import java.util.Scanner;

public class d49Q26kadai {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("引数が指定されていません。");
            return;
        }

        d49Q26kadai obj = new d49Q26kadai();
        obj.show(args[0]);
    }

    void show(String n) {
        System.out.println("value is " + n);
    }
}

