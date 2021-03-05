import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int countSelf = 0;
        int countCompanion = 0;
        int handSelf = 0;
        System.out.println("出す手を選んで数字を入力してね。相手より先に３回勝とう！\n1:グー　2：チョキ　3：パー");
//ブロックの中の変数を外で使いたいなら、その外で変数を定義する
        while (countCompanion < 3 && countSelf < 3) {
            try {
                handSelf = new java.util.Scanner(System.in).nextInt();
                //3以上を入力したときの処理
            } catch (InputMismatchException e) {
                System.out.println("3以下の数字を記入して下さい");
                continue;
            }
            if (handSelf > 3) {

                //参照型のStringかIntegerを調べたいときは　instanceof (String もしくは Integer)

                /*
                変数の宣言　→　<型名> <変数名> ＝ <初期値>
                変数への代入　→　<変数名> = 値
                 ※ 一度定義した変数に対して変数の宣言は使えない/ブロック跨げない
                 */

                System.out.println("3以下の数字を入力してね。\n1:グー　2：チョキ　3：パー");
                handSelf = new java.util.Scanner(System.in).nextInt();
            }

            int handCompanion = new java.util.Random().nextInt(3) + 1;
            //1:グー　2：チョキ　3：パー
            int victory = handSelf - handCompanion;
            switch (handCompanion) {
                case 1:
                    System.out.print("相手はグーを出しました。");
                    break;
                case 2:
                    System.out.print("相手はチョキを出しました。");
                    break;
                case 3:
                    System.out.print("相手はパーを出しました。");
                    break;
            }
            switch (victory) {
                case -1:
                case 2:
                    System.out.println("あなたの勝ち！");
                    countSelf++;
                    break;
                case 0:
                    System.out.println("あいこ！もう一回！");
                    break;
                case -2:
                case 1:
                    System.out.println("あなたの負け！");
                    countCompanion++;
                    break;
            }
            System.out.println("（自分の勝利数" + countSelf + "回/相手の勝利数" + countCompanion + "回）");

        }
        if (countSelf == 3) {
            System.out.println("あなたの優勝です！！！");
        } else {
            System.out.println("相手の優勝です…");
        }


    }
}


