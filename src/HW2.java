import java.util.Scanner;

public class HW2 {

    public static int sumOfAllNumbers(int i) {
        int sum = i / 100 + i % 100 / 10 + i % 100 % 10;
        return sum;
    }

    public static int sumOfAllNumbers(String word1, String word2) {
        String summerspring = word1.concat(word2);
        int str = summerspring.length();
        return str;
    }

    public static boolean sumOfAllNumbers(int b, int c) {
        Scanner in = new Scanner(System.in);
        if (b > 0) {
            return (true);
        } else {
            return (false);
        }

    }
    public static void main(String[] args) {
        int sum = sumOfAllNumbers(123);
        System.out.println(sumOfAllNumbers(sum));
        int str = sumOfAllNumbers("summer", "spring");
        System.out.println(str);
        int b = sumOfAllNumbers(5);
        System.out.println(true);
        int c = sumOfAllNumbers(0);
        System.out.println(false);

    }
}


