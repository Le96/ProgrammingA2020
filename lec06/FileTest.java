package lec06;

/**
 * FileTest
 */
public class FileTest {
    public static void main(String[] args) {
        Directory d1 = new Directory("docs");
        Directory d2 = new Directory("excels");
        File f1 = new File("aaa.xls", 850);
        File f2 = new File("temp.txt", 100);
        d1.add(d2);
        d2.add(f1);
        d1.add(f2);
        System.out.println(d1.getSize());
        System.out.println(d1.getName());
        Directory d3 = new Directory("test");
        for (int i = 0; i < 20; i++) {
            d3.add(new File("dummy" + i, 10));
        }
        System.out.println(d3.getSize());
    }
}