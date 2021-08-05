package geekbrains.JavaLessons;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
       else if (value > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }

    }

    public static void compareNumbers() {
        int a = 5, b = 5;
        System.out.println();

        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }

    }

}

