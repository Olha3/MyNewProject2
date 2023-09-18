import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW7 {

    public static void main(String[] args) {

    List <String> phone = new ArrayList<>();
    phone.add("+380963345434");
    phone.add("80963345434");
    phone.add("+480963345434");
    phone.add("+380963345");

    String regex = "^((8|\\+3)[\\- ]?)?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$";

    Pattern pattern = Pattern.compile(regex);
        for (String phones: phone) {
            Matcher matcher = pattern.matcher(phones);
            System.out.println(phones + ":" + matcher.matches());
        }
    }
}