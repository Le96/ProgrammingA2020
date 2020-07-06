package lec07;

class ExceptionExam {
    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String[] eList = e.getMessage().split(" ");
            // System.out.println("例外は: " + e);
            System.out.println("例外は: " + e.getClass().getName() + ": " + eList[eList.length - 1]);
        }
        System.out.println("プログラムを終了します。");
    }
}