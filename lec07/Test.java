package lec07;

public class Test {
    public static char[] encode(char[] data) {
        StringBuffer encodeData = new StringBuffer();

        int length;
        for (int i = 0; i < data.length; i++) {
            length = 1;
            while (i + 1 < data.length && data[1] == data[i + 1] && length < 9) {
                length++;
                i++;
            }
            encodeData.append(length);
            encodeData.append(data[i]);
        }
        return encodeData.toString().toCharArray();
    }

    public static void print(char[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char input[] = { 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'c', 'c', };
        print(input);
        print(encode(input));
        // don't have to catch the exception
    }
}