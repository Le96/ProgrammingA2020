package lec06;

/**
 * Label
 */
public class Label {

    String caption;
    static String common;

    Label(String caption) {
        this.caption = caption;
    }

    void output() {
        System.out.println(Label.common + ": " + this.caption);
    }
}