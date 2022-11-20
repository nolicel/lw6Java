package carshop.cars;

public class Truck_Car extends Car {

    int weight;

    public Truck_Car(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight=weight;
    }

    @Override
    public double getSalePrice() {
        return weight>2000 ? regularPrice-(regularPrice*0.2) : regularPrice;
    }
}
