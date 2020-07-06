package lec07;

public class Length {
    public static char[] encode(char[] data) {
        StringBuffer encodedData = new StringBuffer();
        int length;
        for (int i = 0; i < data.length; i++) {
            length = 1;
            while (i + 1 < data.length && data[i] == data[i + 1] && length < 9) {
                length++;
                i++;
            }
            encodedData.append(length);
            encodedData.append(data[i]);
        }
        return encodedData.toString().toCharArray();

    }

    public static char[] decode(char[] data) {
        StringBuffer decodedData = new StringBuffer();
        for (int i = 0; i < data.length; i += 2) {
            // int number = (int) data[i] - '0';
            // if(number > 9) throw new RuntimeException();
            int number = Integer.parseInt("" + data[i]);
            char c = data[i + 1];
            while (number-- != 0) {
                decodedData.append(c);
            }
        }
        return decodedData.toString().toCharArray();
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
        print(decode(encode(input)));
        print(decode(input));
        // don't have to catch the exception

    }
}