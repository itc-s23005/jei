// s23005

public class d52Q6kadai {
    public static void main(String[] args) {
        Drink[] dr = {
            new Drink("Gomacola", 150),
            new Drink("MrPepper", 130),
            new Drink("SaltWater", 320)
        };
        VendingMachine vm = new VendingMachine(dr);
        vm.display();
        vm.execCom("i 500");
        vm.execCom("p 1");
        vm.execCom("c 0");
    }
}

class Drink {
    private String name;
    private int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}

class VendingMachine {
    private Drink[] drinks;
    private int cash = 0;
    private int[] coins = {500, 100, 50, 10};

    VendingMachine(Drink[] drinks) {
        this.drinks = drinks;
    }

    public void display() {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(i + ": " + drinks[i]);
        }
    }

    public void execCom(String command) {
        String[] com = command.split(" ");
        switch (com[0]) {
            case "i":
                insertCoin(Integer.parseInt(com[1]));
                break;
            case "p":
                purchaseDrink(Integer.parseInt(com[1]));
                break;
            case "c":
                cancelPurchase(Integer.parseInt(com[1]));
                break;
            default:
                System.out.println("無効なコマンドです");
                break;
        }
    }

    private void insertCoin(int amount) {
        cash += amount;
        System.out.println(amount + "円が投入されました");
    }

    private void purchaseDrink(int index) {
        if (index < 0 || index >= drinks.length) {
            System.out.println("無効な選択です");
            return;
        }

        Drink drink = drinks[index];
        if (cash >= drink.getPrice()) {
            cash -= drink.getPrice();
            System.out.println(drink.getName() + "を購入しました");
        } else {
            System.out.println("残高が不足しています");
        }
    }

    private void cancelPurchase(int index) {
        if (index < 0 || index >= drinks.length) {
            System.out.println("無効な選択です");
            return;
        }
        System.out.println("購入をキャンセルしました");
    }
}

