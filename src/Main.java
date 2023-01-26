import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println(" Задача 1, Задача 2");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
            System.out.println();
        }
        int[] books = {100, 200, 300, 400};
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i != books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println(" Задача 3");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length - 1; i >= 0; --i) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        double[] number = {1.57, 7.654, 9.986};
        for (int i = number.length - 1; i >= 0; --i) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }System.out.println();
        int[] books = {100, 200, 300, 400};
        for (int i = books.length - 1; i >=0; --i) {
            System.out.print(books[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println(" Задача 4");
        int[] number = new int[11];
        for (int i = 0; i <= 10; i++) {
            number[i] = i;
        }
        System.out.print("Начальный массив " + Arrays.toString(number));

        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 1) {
                number[i] +=1;
            }

        }
        System.out.println("Итоговый массив " + Arrays.toString(number));
    }

}