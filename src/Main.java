import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double [] numbersFractions = {1.57, 7.654, 9.986};
        int [] random = {1, 2, 3, 4, 5};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] numbers = new int [3];
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
        double [] numbersFractions = {1.57, 7.654, 9.986};
        int [] random = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(","+numbers[i]);}
        System.out.println(" ");
        for (int i = 0; i < numbersFractions.length; i++) {
            System.out.print(","+numbersFractions[i]);}
        System.out.println(" ");
        for (int i = 0; i < random.length; i++) {
            System.out.print(","+random[i]);}
        System.out.println(" ");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int [] numbers = {4,5,6};
        double [] numbersFractions = {1.57, 7.654, 9.986};
        int [] random = {1, 2, 3, 4, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(","+numbers[i]);}
        System.out.println(" ");
        for (int i = numbersFractions.length - 1; i >= 0; i--) {
            System.out.print(","+numbersFractions[i]);}
        System.out.println(" ");
        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(","+random[i]);}
        System.out.println(" ");


    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] numbers = {4,5,6};
        for (int i = 0; i < numbers.length; i++) {
            int x=numbers[i];
            if (x%2==0);
            else
                x++;
                numbers[i]=x;
        }
        System.out.println(Arrays.toString(numbers));




    }
}