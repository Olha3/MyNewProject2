import java.util.List;

public class Fruits {
    public String name;
    public String color;
    public int price;
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    public Fruits(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args) {
        Fruits f1 = new Fruits("Apple", "red", 10);
        Fruits f2 = new Fruits("Garnet", "red", 20);
        Fruits f3 = new Fruits("Orange", "orange", 5);

       List<Fruits> fruits = List.of(f1, f2, f3);
       List<Fruits> filteredFruits = fruits.stream().filter
               (fruits1 -> fruits.getColor(red) && fruits.getPrice > 5).collect();
        System.out.println(filteredFruits);

        Fruits.stream().map(el -> el.toUpperCase()).forEach(System.out::println);
    }

}
