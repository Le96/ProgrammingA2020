package lec06;

public class ShopTest {
    public static void main(String[] args) {
        Shop[] mall = new Shop[] { new FlowerShop(), new Bakery(), new FlowerShop() };
        for (int i = 0; i < mall.length; i++) {
            System.out.println(mall[i].name + " of " + mall[i].sell());
        }
    }
}