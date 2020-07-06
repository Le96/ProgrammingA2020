package lec06;

/**
 * Directory
 */
public class Directory extends File {
    private File[] files;

    public Directory(String name) {
        super(name, 1);
        this.files = new File[10];
    }

    public void add(File file) {
        for (int index = 0; index < this.files.length; index++)
            if (files[index] == null) {
                files[index] = file;
                return;
            }
    }

    @Override
    public int getSize() {
        int size = this.size;
        for (int index = 0; index < this.files.length; index++)
            if (files[index] != null)
                size += files[index].getSize();
        return size;
    }
}