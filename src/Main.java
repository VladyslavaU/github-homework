public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static void print(String input, int number) {
        number = Math.abs(number); //если введут отрицвтельное число
        for (int i = 0; i < number; i++) {
            System.out.println(input);
        }
    }
}