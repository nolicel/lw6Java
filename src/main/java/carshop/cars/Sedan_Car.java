package carshop.cars;

public class Sedan_Car extends Car {
    int length;

    public Sedan_Car(int speed, boolean isSellOut, double regularPrice, String color, int length) {

        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        return length >20 ? regularPrice-(regularPrice*0.05) : regularPrice;
    }
}
