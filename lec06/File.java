package lec06;

/**
 * File
 */
public class File {
    protected String name;
    protected int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }
}