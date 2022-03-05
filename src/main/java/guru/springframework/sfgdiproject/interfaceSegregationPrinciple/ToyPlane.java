package guru.springframework.sfgdiproject.interfaceSegregationPrinciple;

public class ToyPlane implements Toy, Movable, Flyable {
    double price;
    String color;

    @Override
    public void fly() {

    }

    @Override
    public void move() {
    }

    @Override
    public void setPrice(double Price) {

    }

    @Override
    public void setColor(String color) {

    }
}
