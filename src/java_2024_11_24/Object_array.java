package java_2024_11_24;

import java.util.ArrayList;

public class Object_array {
    public static void main(String[] args) {
        ArrayList<Goods> goods_array = new ArrayList<>();
        Goods g1 = new Goods("1", "手机", 8000, 10);
        Goods g2 = new Goods("2", "laptop", 5000, 20);
        Goods g3 = new Goods("3", "book", 20, 100);
        Goods g4 = new Goods("4", "ipad", 2000, 3);
        goods_array.add(g1);
        goods_array.add(g2);
        goods_array.add(g3);
        goods_array.add(g4);
        for (Goods good:goods_array) {
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getAmount_LeftOver());

        }

    }
}
