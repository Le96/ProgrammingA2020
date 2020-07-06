package lec06;

/**
 * Bakery
 */
public class Bakery extends Shop {
    Bakery() {
        super("パン屋");
    }

    @Override
    public String sell() {
        return "パン";
    }
}