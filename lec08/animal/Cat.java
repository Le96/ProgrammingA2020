package lec08.animal;

public class Cat extends Animal {
    // singleton pattern
    private static Cat instance = new Cat();

    public static Cat getInstance() {
        return instance;
    }

    public String say() {
        return "ニャー";
    }
}