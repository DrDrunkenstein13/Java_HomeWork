class MyHomeWork {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
     static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 7;
        int b = 5;
        if (a +b >= 0) {
            System.out.println("положительная");
        } else {
                System.out.println("отрицательная");
            }
    }
        static void printColor() {
            int value = 101;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else if (value > 100) {
                System.out.println("Зеленый");
            }

        }
        static void compareNumbers() {
        int c = 7;
        int d = 7;
        if (c >= d) {
            System.out.println(c + ">=" + d);
        }else if (c < d) {
            System.out.println(c + "<" + d);
        }
        }



}