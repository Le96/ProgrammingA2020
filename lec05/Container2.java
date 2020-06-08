package lec05;

public class Container2 {
    int[] values;

    Container2(int[] temp) {
        this.values = temp;
    }

    void printArray() {
        for (int i = 0; i < this.values.length - 1; i++)
            System.out.print(this.values[i] + ", ");
        System.out.println(this.values[this.values.length - 1]);
    }

    int search(int k) {
        for (int i = 0; i < this.values.length; i++)
            if (this.values[i] == k)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 100, 10, 1000, 50, 10000, 999, 5 };
        int key = 10000;
        Container2 container = new Container2(array);
        container.printArray();
        System.out.println(key + " at " + container.search(key));
    }
}
