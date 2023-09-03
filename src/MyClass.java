public class MyClass {
    int year = 2023;

    static int sumOfNumbers(int a, int b) {
        int c = a + b; //sum of 2 numbers
        return c;
    }

    public static void main(String[] args) {
        int c = sumOfNumbers(1, 2);
        System.out.println(c);
    }
}