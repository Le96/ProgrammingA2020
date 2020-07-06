package lec06;

/**
 * FlowerShop
 */
public class FlowerShop extends Shop {
    FlowerShop() {
        super("花屋");
    }

    @Override
    public String sell() {
        return "花";
    }
}