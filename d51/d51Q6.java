public class d51Q6 {
    public static void main(String[] args) {
        // 引数の長さをチェック
        if (args.length == 0 || args[0].length() < 6) {
            System.out.println("商品コードを正しく入力してください。");
            return;
        }

        Item[] li = { new Item("AA", "魚類"), new Item("BB", "肉類") };
        Item[] si = { new Item("A1", "さば"), new Item("A2", "さんま"),
                      new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
                      new Item("B3", "豚肉") };
        ItemMaster im = new ItemMaster(li, si);

        String lcode = args[0].substring(0, 2);
        String scode = args[0].substring(2, 4);
        String details = args[0].substring(4);

        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);

        System.out.println("商品コード: " + args[0]);
        System.out.println("大分類名: " + lname);
        System.out.println("小分類名: " + sname);
        System.out.println("詳細コード: " + details);
    }
}

class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;

    private Item[] majorItems;
    private Item[] minorItems;

    ItemMaster(Item[] majorItems, Item[] minorItems) {
        this.majorItems = majorItems;
        this.minorItems = minorItems;
    }

    public String getItemName(int type, String code) {
        Item[] items = (type == MAJOR) ? majorItems : minorItems;
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                return item.getName();
            }
        }
        return "不明なコード";
    }
}

