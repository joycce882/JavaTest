package java_2024_11_24;

public class Goods {
    private String id;
    private String name;
    private double price;
    private  int amount_LeftOver;
    public  Goods(){}
    public  Goods(String id,String name,double price,int amount_LeftOver){
        this.id = id;
        this.name = name;
        this.amount_LeftOver = amount_LeftOver;
        this.price = price;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return amount_LeftOver
     */
    public int getAmount_LeftOver() {
        return amount_LeftOver;
    }

    /**
     * 设置
     * @param amount_LeftOver
     */
    public void setAmount_LeftOver(int amount_LeftOver) {
        this.amount_LeftOver = amount_LeftOver;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", price = " + price + ", amount_LeftOver = " + amount_LeftOver + "}";
    }
}
