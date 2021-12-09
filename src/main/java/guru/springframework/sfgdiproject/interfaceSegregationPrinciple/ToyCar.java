package guru.springframework.sfgdiproject.interfaceSegregationPrinciple;

public class ToyCar implements Toy, Movable {
    double price;
    String color;

    @Override
    public void move() {
        System.out.println("ToyCar: Start moving car.");
    }

    @Override
    public void setPrice(double Price) {
        this.price = Price;
    }

    @Override
    public void setColor(String Color) {
        this.color = Color;
    }
}
