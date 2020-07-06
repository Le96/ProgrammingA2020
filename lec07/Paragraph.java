package lec07;

public class Paragraph extends Element {
    static int numberOfInstances = 0;
    Element[] items = new Element[10];
    int number;
    int numberOfItems = 0;

    Paragraph() {
        super();
        this.number = ++Paragraph.numberOfInstances;
    }

    @Override
    void print() {
        System.out.println("<p" + this.number + ">");
        for (int i = 0; i < Math.min(this.numberOfItems, 10); i++)
            items[i].print();
        System.out.println("</p" + this.number + ">");
    }

    @Override
    void add(Element item) throws ArrayIndexOutOfBoundsException {
        this.items[this.numberOfItems++] = item;
    }
}