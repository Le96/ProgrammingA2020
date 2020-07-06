package lec07;

public class Text extends Element {
    String text;

    Text(String text) {
        super();
        this.text = text;
    }

    @Override
    void print() {
        System.out.println("<t>" + this.text + "</t>");
    }

    @Override
    void add(Element item) {
    }
}