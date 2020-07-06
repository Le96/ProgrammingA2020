package lec07;

public class TagMain {
    public static void main(String[] args) {
        Element p1 = new Paragraph();
        Element p2 = new Paragraph();
        Element t1 = new Text("aabbcc");
        Element t2 = new Text("XYZ");
        Element t3 = new Text("10000");
        try {
            p1.add(t1);
            p1.add(t2);
            p2.add(t3);
            p1.add(p2);
            while (true) {
                p1.add(new Paragraph());
            }
        } catch (RuntimeException re) {
        }
        p1.print();
    }
}